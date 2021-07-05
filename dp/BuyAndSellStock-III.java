import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] p = new int[n];
        
        for(int i = 0;i<n;i++){
            p[i] = input.nextInt();
        }
        int f = input.nextInt();
        
        int profit = maxProfit(p,f);
        System.out.println(profit);
    }
    
    public static int maxProfit1(int[] p, int f ){
        int bsp = -p[0];
        int ssp = 0;

        for(int i = 1;i<p.length;i++){
            int nbsp = ssp - p[i];
            int nssp = bsp + p[i] - f;
            bsp = Math.max(bsp, nbsp);
            ssp = Math.max(ssp, nssp);
        }
        return ssp;
    }
    
    public static int maxProfit(int[] p, int f ){
        
        // index 0 form buy and 1 for sell
        int[][] dp = new int[p.length][2];
        dp[0][0] = -p[0];
        
        for(int i = 1;i<p.length;i++){
            dp[i][0] = Math.max(dp[i-1][0] , -p[i] + dp[i-1][1] );
            dp[i][1] = Math.max(dp[i-1][0] + p[i] - f, dp[i-1][1] );
        }
        return dp[p.length - 1][1];
        
    } 

    

}