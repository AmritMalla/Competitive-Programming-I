
import java.util.*;

public class Main {

    private static class Pair{
        int w;
        int v;

        Pair(int w, int v){
            this.w = w;
            this.v = v;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for(int i = 0;i<n;i++){
            values[i] = input.nextInt();
        }
        for(int i = 0;i<n;i++){
            weights[i] = input.nextInt();
        }
        int capacity = input.nextInt();

        Queue<Pair> que = new PriorityQueue<>((Pair p1, Pair p2) -> {
                double d1 = p1.v / (double)p1.w;
                double d2 = p2.v / (double)p2.w;
                if (d1 < d2) return 1;
                else return -1;
        });

        for(int i = 0;i<n;i++){
            que.add(new Pair(weights[i], values[i]));
        }

        int pick = 0;
        double res = 0;
        while (!que.isEmpty() && pick < capacity){
            Pair p = que.poll();
            if(p.w + pick < capacity){
                pick += p.w;
                res += p.v;
            }else{
                int rem = capacity - pick;
                pick = capacity;
                res += (p.v/(double)p.w) * rem;
            }
        }
        System.out.println(res);
    }
}
