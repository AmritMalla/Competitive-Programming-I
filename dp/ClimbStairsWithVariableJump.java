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
        dp[n] = 1;
        for(int i = n-1;i>= 0;i--){
            for(int j = 1;j<= arr[i] && j + i < (n + 1);j++){
                dp[i] += dp[i + j];
            }
        }
        
        // int ways = numWays(arr, 0);
        System.out.println(dp[0]);
    }

    //memoized version
    static int[] memo ;
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = input.nextInt();
        }
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        int ways = numWays(arr, 0);
        System.out.println(ways);
    }
    
    public static int numWays(int[] arr, int idx ){
        if(idx > arr.length) return 0;
        if(idx == arr.length){
            return 1;
        }
        if(memo[idx] != -1) return memo[idx]; 
        
        int ways = 0;
        for(int i = 1;i<= arr[idx];i++){
            ways += numWays(arr, idx + i);
        }
        memo[idx] = ways;
        return ways;
    }


}