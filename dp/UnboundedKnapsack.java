	import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int[] vals = new int[n];
            int[] wts = new int[n];
            for(int i = 0;i<n;i++){
                vals[i] = input.nextInt();
            }
            for(int i = 0;i<n;i++){
                wts[i] = input.nextInt();
            }
            int cap = input.nextInt();
            
            int[] dp = new int[cap + 1];
            
            //using Combination
            for(int i = 0;i<n;i++){
                for(int j = 1;j <= cap;j++){
                    if(j >= wts[i]){
                        dp[j] = Math.max(dp[j], vals[i] + dp[j- wts[i]] );
                    }
                    
                }
            }

            //Using permutation
            /*
            for(int i = 1;i<=cap;i++){
                
                for(int j = 0;j<n;j++){
                    if(i >= wts[j] ){
                        dp[i] = Math.max(dp[i], dp[i - wts[j]] + vals[j] );
                    }    
                }
            }
            */

            System.out.println(dp[cap]);
            
	    }
	}