import java.io.*;
import java.util.*;

public class Main {
    
    public static int coolDownProfit(int[] p){
        int bsp = -p[0], ssp = 0, csp = 0;
        for(int i = 1;i<p.length;i++){
            int nbsp = csp - p[i];
            int nssp = p[i] + bsp;
            
            bsp = Math.max(bsp, nbsp);
            csp = Math.max(csp, ssp);
            ssp = Math.max(ssp, nssp);
        }
        return ssp;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] p = new int[n];
        for(int i = 0;i<n;i++){
            p[i] = input.nextInt();
        }
        
        int profit = coolDownProfit(p);
        System.out.println(profit);
    }

}