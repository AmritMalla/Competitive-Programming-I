import java.io.*;
import java.util.*;

public class Main {
    
    // O(n^3) Solution
    public static int maxProfit(int[] p, int k){
        int n = p.length;
        int[][] dp  = new int[k + 1][n];
        
        for(int i = 1;i<=k;i++){
            for(int j = 1;j<n;j++){
                dp[i][j] = dp[i][j-1];
                for(int l = 0;l<j;l++){
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][l] + p[j] - p[l] );
                }
            }
        }
        return dp[k][n-1];
    }

    //O(n^2) Solution
    public static int maxProfit1(int[]p, int k ){
        int n = p.length;
        int[][] dp  = new int[k + 1][n];
        
        for(int i = 1;i<=k;i++){
            int max = dp[i-1][0] - p[0];
            
            for(int j = 1;j<n;j++){
                dp[i][j] = Math.max( max + p[j], dp[i][j-1] );
                max = Math.max(dp[i-1][j] - p[j], max);
            }
        }
        return dp[k][n-1];
    }


    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] p = new int[n];
        
        for(int i = 0;i<n;i++){
            p[i] = input.nextInt();
        }
        int k = input.nextInt();
        
        int profit = maxProfit1(p,k);
        System.out.println(profit);
    }

}