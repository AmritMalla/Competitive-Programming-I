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
        int[] dp = new int[amt + 1];
        dp[0] = 1;
        for(int i = 1;i<=amt;i++){
            for(int j = 0;j<n;j++){
                if(coins[j] <= i ){
                    dp[i] += dp[i - coins[j]];
                }
            }
        }
        System.out.println(dp[amt]);
    }
}