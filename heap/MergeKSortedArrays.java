import java.io.*;
import java.util.*;

public class Main {
    static class  Pair implements Comparable<Pair>{
        int val;
        int row;
        int col;

        public Pair(int val, int row, int col) {
            this.val = val;
            this.row = row;
            this.col = col;
        }

        @Override
        public int compareTo(Pair o) {
            return this.val - o.val;
        }
    }
    public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
        ArrayList<Integer> rv = new ArrayList<>();
        // write your code here
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>();
        for(int i = 0;i<lists.size();i++){
            priorityQueue.add(new Pair(lists.get(i).get(0),i, 0));
        }
//        int sz = lists.stream().map(l -> l.size()).reduce(0, (a, b)-> a + b);
        while (priorityQueue.size() > 0 ){
            Pair p = priorityQueue.poll();
            rv.add(p.val);
            int row = p.row;
            int col = p.col + 1;
            if(col < lists.get(row).size()){
                priorityQueue.add(new Pair(lists.get(row).get(col), row, col));
            }
        }

        return rv;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for(int i = 0; i < k; i++){
            ArrayList<Integer> list = new ArrayList<>();

            int n = Integer.parseInt(br.readLine());
            String[] elements = br.readLine().split(" ");
            for(int j = 0; j < n; j++){
                list.add(Integer.parseInt(elements[j]));
            }

            lists.add(list);
        }

        ArrayList<Integer> mlist = mergeKSortedLists(lists);
        for(int val: mlist){
            System.out.print(val + " ");
        }
        System.out.println();
    }

}