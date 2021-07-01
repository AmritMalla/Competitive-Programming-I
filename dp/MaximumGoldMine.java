import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] mine = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                mine[i][j] = input.nextInt();
            }
        }
        
        int[][] dp = new int[n][m];
        
        for(int i = 0;i<n;i++){
            dp[i][0] = mine[i][0];
        }
        
        for(int j = 1;j<m;j++){
            for(int i = 0;i<n;i++){
                int a = (i-1)<0?0:dp[i-1][j-1];
                int b = ((i + 1)==n)?0:dp[i+1][j-1];
                dp[i][j] = Math.max(dp[i][j-1], Math.max(a, b)) + mine[i][j];
            }
        }
        
        int res = 0;
        for(int i = 0;i<n;i++){
            res = Math.max(res, dp[i][m-1] );
        }
        System.out.println(res);
    }

}