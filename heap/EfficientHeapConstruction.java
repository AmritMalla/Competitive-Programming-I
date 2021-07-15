import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static class PriorityQueue {

        ArrayList<Integer> data;

        public PriorityQueue(ArrayList<Integer> data){
            this.data = data;
            for(int i = data.size()/ 2 - 1;i>=0;i--){
                downHeapify(i);
            }
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
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int n = input.nextInt();
        for(int i = 0;i<n;i++){
            int x = input.nextInt();
            list.add(x);
        }
        PriorityQueue pq = new PriorityQueue(list);

        while (pq.size() > 0){
            System.out.println(pq.remove());
        }
    }
}