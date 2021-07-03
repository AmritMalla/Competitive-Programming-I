import java.io.*;
import java.util.*;

public class Main {

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
        
        int[][] dp = new int[n + 1][capacity + 1];
        
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=capacity;j++){
                if(j >= weights[i-1]){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weights[i-1]] + values[i-1] );
                }else dp[i][j] = dp[i-1][j];
            }
        }
        System.out.println(dp[n][capacity] );
        
    }
}