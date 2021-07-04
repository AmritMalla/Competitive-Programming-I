import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int ways = waysOfTiling(n, m);
        System.out.println(ways);
    }
    
    public static int waysOfTiling(int n, int m){
        if(n < m) return 1;
        
        int[] dp = new int[n + 1];
        
        for(int i = 1;i<=n;i++){
            if(i < m){
                dp[i] = 1;
            }else if(i == m){
                dp[i] = 2;
            }else{
                dp[i] = dp[i-1] + dp[i - m];
            }
        }
        return dp[n];
    }
}