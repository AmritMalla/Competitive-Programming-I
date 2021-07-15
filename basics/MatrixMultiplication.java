import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int m1 = scn.nextInt();
    int[][] matrix1 = new int[n1][m1];
    for(int i =0;i<n1;i++){
        for(int j = 0;j<m1;j++){
            matrix1[i][j] = scn.nextInt();
        }
    }
    
    int n2 = scn.nextInt();
    int m2 = scn.nextInt();
    int[][] matrix2 = new int[n2][m2];
    for(int i =0;i<n2;i++){
        for(int j = 0;j<m2;j++){
            matrix2[i][j] = scn.nextInt();
        }
    }
    
    if(m1 != n2){
        System.out.println("Invalid input");
        return;
    }
    
    int[][] a = new int[n1][m2];
    
    for(int i = 0;i<n1;i++){
        for(int j = 0;j<m2;j++){
            for(int k = 0;k<m1;k++){
                a[i][j] += matrix1[i][k] * matrix2[k][j];
            }
        }
    }
    
    for(int[] r: a){
        for(long c: r){
            System.out.print(c + " ");
            
        }
        System.out.println();
    }
 }

}