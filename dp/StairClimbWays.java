import java.io.*;
import java.util.*;

public class Main {
    static int[] memo;
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        memo = new int[n + 1];
        int ways = climbWays(n);
        System.out.println(ways);
    }
    
    public static int climbWays(int n){
        if(n < 0) return 0;
        else if(n == 0) return 1;
        else if(memo[n] != 0) return memo[n];
        memo[n] = climbWays(n - 1) + climbWays(n - 2) + climbWays(n - 3);        
        return memo[n];
    }

     
    public static int climbWays(int n){
        if(n == 0) return 1;
        else if(n <= 2) return n;
        int a = 1, b = 1, c = 2; 
        while(n > 2){
            int next = a + b + c;
            a = b;
            b = c;
            c = next;
            n--;
        }
        return c;
        
    }


}