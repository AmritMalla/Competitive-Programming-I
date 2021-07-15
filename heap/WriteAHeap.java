import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static class PriorityQueue {

        ArrayList<Integer> data;

        public PriorityQueue() {
            data = new ArrayList<>();
        }

        public void add(int val) {
            int child = size();
            data.add(val);
            int parent = (child - 1) / 2;
            while (child != parent && data.get(child) < data.get(parent)) {
                Collections.swap(data, child, parent);
                child = parent;
                parent = (child - 1) / 2;
            }
        }

        public int remove() {
            if (size() == 0) {
                System.out.println("Underflow");
                return -1;
            }
            Collections.swap(data, 0, size() - 1);
            int val = data.remove(size() - 1);

            int parent = 0;
            int child1 = parent * 2 + 1;
            int child2 = parent * 2 + 2;

            while(child1 < size()){
                int minIndex = parent;

                if(child1 < data.size() && data.get(child1) < data.get(minIndex)){
                    minIndex = child1;
                }

                if(child2 < data.size() && data.get(child2) < data.get(minIndex)){
                    minIndex = child2;
                }

                if(parent != minIndex){
                    Collections.swap(data, parent, minIndex);
                    parent = minIndex;
                    child1 = parent * 2 + 1;
                    child2 = parent * 2 + 2;
                }else break;

                /*if(child2 < size()){
                    if(data.get(parent) < data.get(child1) && data.get(parent) < data.get(child2))break;
                    Integer min = Math.min(data.get(parent), Math.min(data.get(child1), data.get(child2)));
                    if(min == data.get(child1)){
                        Collections.swap(data, parent, child1);
                        parent = child1;
                    }else if(min == data.get(child2)){
                        Collections.swap(data, parent, child2);
                        parent = child2;
                    }
                }else{
                    if(data.get(parent) > data.get(child1)){
                        Collections.swap(data, parent, child1);
                        parent = child1;
                    }else break;
                }*/
            }

            return val;
        }

        public int peek() {
            if (size() == 0) {
                System.out.println("Underflow");
                return -1;
            }
            return data.get(0);
        }

        public int size() {
            return data.size();
        }
    }

    public static class PriorityQueue1 {

        ArrayList<Integer> data;

        public PriorityQueue1() {
            data = new ArrayList<>();
        }

        public void add(int val) {
            data.add(val);
            upHeapify(data.size() - 1);
        }

        private void upHeapify(int idx){
            if(idx == 0) return;
            int pi = (idx - 1)/2;
            if(data.get(idx) < data.get(pi)){
                Collections.swap(data, idx, pi);
                upHeapify(pi);
            }
        }

        public int remove() {
            if (size() == 0) {
                System.out.println("Underflow");
                return -1;
            }
            Collections.swap(data, 0, size() - 1);
            int val = data.remove(size() - 1);

            downHeapify(0);

            return val;
        }

        private void downHeapify(int pi) {
            int c1 = pi * 2 + 1;
            int c2 = pi * 2 + 2;

            int minidx = pi;
            if(c1 < data.size() && data.get(c1) < data.get(minidx)){
                minidx = c1;
            }

            if(c2 < data.size() && data.get(c2) < data.get(minidx)){
                minidx = c2;
            }

            if(minidx != pi){
                Collections.swap(data, pi, minidx);
                downHeapify(minidx);
            }


            /*if(c1 >= size()){
                return;
            }
            else if(c2 >= size()){
                if(data.get(idx) > data.get(c1)){
                    Collections.swap(data, idx, c1);
                }
            }else{
                int min = Math.min(data.get(idx), Math.min(data.get(c1), data.get(c2)));
                if(min == data.get(c1)){
                    Collections.swap(data, idx, c1);
                    downHeapify(c1);
                }else if(min == data.get(c2)){
                    downHeapify(c2);
                    Collections.swap(data, idx, c2);
                }
            }*/
        }

        public int peek() {
            if (size() == 0) {
                System.out.println("Underflow");
                return -1;
            }
            return data.get(0);
        }

        public int size() {
            return data.size();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue qu = new PriorityQueue();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}