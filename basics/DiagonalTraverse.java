import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                a[i][j] = input.nextInt();
             }
        }
        
        for(int d = 0;d<n;d++){
            for(int i = 0, j = d;j<n;j++, i++){
                System.out.println(a[i][j]);
            }
        }
    }

}