import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] p = new int[n];
        for(int i = 0;i<n;i++){
            p[i] = input.nextInt();
        }
        
        int minP = p[0], profit = 0;
        for(int i  = 1;i< n;i++){
            profit = Math.max(profit, p[i] - minP);
            minP = Math.min(minP, p[i] );
        }
        System.out.println(profit);
        
    }

}