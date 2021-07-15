import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] matrix = new int[n][m];
    for(int i =0;i<n;i++){
        for(int j = 0;j<m;j++){
            matrix[i][j] = scn.nextInt();
        }
    }
    
    for(int j = 0;j<m;j++){
        for(int i = 0;i<n;i++){
            if(j % 2 == 0)
                System.out.println(matrix[i][j] );
            else
                System.out.println(matrix[n-1-i][j]);
        
        }
    }
    
   }

}