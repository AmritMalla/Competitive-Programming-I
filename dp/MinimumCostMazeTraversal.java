import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] maze = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                maze[i][j] = input.nextInt();
            }
        }
        
        int[][] dp = new int[n][m];
        
        dp[0][0] = maze[0][0];
        
        for(int i = 1;i<n;i++){
            dp[i][0] = maze[i][0] + dp[i-1][0];
        }
        
        for(int j = 1;j<m;j++){
            dp[0][j] = maze[0][j] + dp[0][j-1];
        }
        
        for(int i = 1;i<n;i++){
            for(int j = 1;j<m;j++){
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + maze[i][j];
            }
        }
        System.out.println(dp[n-1][m-1]);
    }

}