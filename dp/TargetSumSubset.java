import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = input.nextInt();
        }
        int target = input.nextInt();
        boolean[][] dp = new boolean[n + 1][target + 1];
        for(int i = 0;i<n;i++){
            dp[i][0] = true;
        }
        
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=target;j++){
                if(j >= a[i-1] ){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-a[i-1]];
                }else dp[i][j] = dp[i-1][j];
            }
        }
        
        System.out.println(dp[n][target]);
    }
    
}