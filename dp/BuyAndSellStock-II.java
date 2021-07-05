import java.io.*;
import java.util.*;

public class Main {
    
    public static int maxProfits1(int[] p ){
        int bd = 0, sd = 0, profit = 0;
        for(int i = 1;i<p.length;i++){
            if(p[i] >= p[i-1] ){
                sd++;
            }else{
                profit += p[sd] - p[bd];
                bd = i;
                sd = i;
            }
        }
        profit += p[sd] - p[bd];
        return profit;
    }
    
    public static int maxProfits(int[] p ){
        int profit = 0;
        for(int i = 1;i<p.length;i++){
            profit += Math.max(p[i] - p[i-1], 0);
        }
        return profit;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] p  =new int[n];
        
        for(int i = 0;i<n;i++){
            p[i] = input.nextInt();
        }
        
        System.out.println(maxProfits1(p ));
        
    }

}