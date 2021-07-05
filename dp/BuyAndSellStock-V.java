import java.io.*;
import java.util.*;

public class Main {
    
    
    public static int maxProfitDualTransaction(int[] p){
        int[] bs = new int[p.length];
        
        int leastPrice = p[0], profit = 0;
        for(int i = 1;i<p.length;i++){
            profit = Math.max(profit, p[i] - leastPrice );
            leastPrice = Math.min(leastPrice, p[i]);
            bs[i] = profit;
        }
        
        int[] sb = new int[p.length];
        int maxPrice = p[p.length - 1];
        profit = 0;
        
        for(int i = p.length - 1;i>= 0;i--){
            profit = Math.max(profit, maxPrice - p[i]);
            maxPrice = Math.max(maxPrice,p[i]);
            sb[i] = profit;
        }
        
        int res = 0;
        for(int i =0;i<p.length;i++){
            res = Math.max(res, sb[i] + bs[i] );
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] p = new int[n];
        for(int i = 0;i<n;i++){
            p[i] = input.nextInt();
            
        }
        int maxProfit = maxProfitDualTransaction(p);
        System.out.println(maxProfit);
    }

}