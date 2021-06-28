import java.io.*;
import java.util.*;

public class Main {

    public static void rotate(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i + 1;j<arr.length;j++){
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
        }
        
        for(int i= 0;i<arr.length;i++){
            for(int j = 0, k = arr.length-1;j<k;j++,k--){
                int temp = arr[i][j];
                arr[i][j] = arr[i][k]; 
                arr[i][k] = temp;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        rotate(arr);
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}