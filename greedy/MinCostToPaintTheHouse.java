import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] costs = new int[n][3];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<3;j++){
                costs[i][j] = input.nextInt();
            }
        }
        System.out.println(minCost(costs));
    }
    
    public static int minCost(int[][] costs){
        int r = costs[0][0];
        int g = costs[0][1];
        int b = costs[0][2];
        for(int i = 1;i<costs.length;i++){
            int nr = costs[i][0] + Math.min(g, b);
            int ng = costs[i][1] + Math.min(r, b);
            int nb = costs[i][2] + Math.min(r, g);
            r = nr;
            g = ng;
            b = nb;
        }
        return Math.min(r, Math.min(g, b));
    } 
}