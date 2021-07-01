import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int[] dp = new int[n + 1];
        dp[n] = 0;
        for(int i = n-1;i>= 0;i--){
            dp[i] = dp.length + 1;
            for(int j = 1;j<= arr[i] && j + i < (n + 1);j++){
                dp[i] = Math.min(dp[i], dp[i + j] + 1);
            }
        }
        System.out.println(dp[0]);
    }

}