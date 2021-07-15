import java.util.*;

public class Main {
    public static class PriorityQueue<T> {

        ArrayList<T> data;
        Comparator comp;

        public PriorityQueue() {
            data = new ArrayList<>();
            comp = null;
        }

        public PriorityQueue(Comparator comp) {
            data = new ArrayList<>();
            this.comp = comp;
        }

        public void add(T val) {
            data.add(val);
            upHeapify(data.size() - 1);
        }

        private void upHeapify(int idx){
            if(idx == 0) return;
            int pi = (idx - 1)/2;
            if(isSmaller(idx, pi)){
                Collections.swap(data, idx, pi);
                upHeapify(pi);
            }
        }

        public T remove() {
            if (size() == 0) {
                System.out.println("Underflow");
                return  null;
            }
            Collections.swap(data, 0, size() - 1);
            T val = data.remove(size() - 1);

            downHeapify(0);

            return val;
        }

        private void downHeapify(int pi) {
            int c1 = pi * 2 + 1;
            int c2 = pi * 2 + 2;

            int minidx = pi;
            if(c1 < data.size() && isSmaller(c1, minidx)){
                minidx = c1;
            }

            if(c2 < data.size() && isSmaller(c2, minidx)){
                minidx = c2;
            }

            if(minidx != pi){
                Collections.swap(data, pi, minidx);
                downHeapify(minidx);
            }
        }

        private boolean isSmaller(int i, int j){
            if(comp == null){

                Comparable ith = (Comparable) data.get(i);
                Comparable jth = (Comparable) data.get(j);
                if(ith.compareTo(jth) < 0){
                    return true;
                }else return false;
            }else{
                if(comp.compare(data.get(i), data.get(j)) < 0)
                    return true;
                else return false;
            }
        }


        public T peek() {
            if (size() == 0) {
                System.out.println("Underflow");
                return null;
            }
            return data.get(0);
        }

        public int size() {
            return data.size();
        }
    }

    static class Student implements Comparable<Student>{
        int roll;
        int age;
        int marks;

        public Student(int roll, int age, int marks) {
            this.roll = roll;
            this.age = age;
            this.marks = marks;
        }

        /*
         * If this > other return +ve
         * if this == othr return 0
         * if this < other return -ve
         *
         * */
        @Override
        public int compareTo(Student o) {
            return this.roll - o.roll;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "roll=" + roll +
                    ", age=" + age +
                    ", marks=" + marks +
                    '}';
        }
    }

    public static class StudentAgeComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.age - o2.age;
        }
    }

    public static class StudentMarksComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.marks - o1.marks;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // if comparator is not provided then comparable is used
        // if provided then provided comparator is used
        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentMarksComparator());
        pq.add(new Student(13, 12, 30));
        pq.add(new Student(12, 17, 99));
        pq.add(new Student(5, 10, 100));
        pq.add(new Student(7, 20, 90));

        while(pq.size() > 0){
            System.out.println(pq.remove());
        }

    }
}