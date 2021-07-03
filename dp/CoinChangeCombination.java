import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] coins = new int[n];
        for(int i = 0;i<n;i++){
            coins[i] = input.nextInt();
        }
        int amt = input.nextInt();
        
        int[] dp = new int[amt+1];
        
        dp[0] = 1;
        
        for(int i = 1;i<=n;i++){
            for(int j = coins[i-1];j<=amt;j++){
                dp[j] += dp[j- coins[i-1]];
            }
        }
        System.out.println(dp[amt]);
    }
}