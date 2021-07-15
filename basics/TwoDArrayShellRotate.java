import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        
        int[][] a = new int[n][m];
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                a[i][j] = input.nextInt();        
            }
        }
        int s = input.nextInt();
        int r = input.nextInt();
        
        int[] oneDArray =  get1DArray(a, s-1);
        
        rotate(oneDArray, oneDArray.length - r);
        fill1DArray(a, oneDArray, s-1);
        display(a);
    }
    
    public static void fill1DArray(int[][]a, int[] fill, int s ){
        int right = a[0].length - s - 1, bottom = a.length - s - 1;
        int i = s , j = s , k = 0;
        while(j < right){
            a[i][j] = fill[k++];
            j++;
        }
        
        while(i < bottom){
            a[i][j] = fill[k++];
            i++;
        }
        while(j> s){
            a[i][j] = fill[k++];
            j--;
        }
        while(i > s){
            a[i][j] = fill[k++];
            i--;
        }
    }
    
    public static int[] get1DArray(int[][] a, int s){
        int right = a[0].length - s - 1, bottom = a.length - s - 1;
        int len = (right - s) * 2 + (bottom - s) * 2;
        int[] arr = new int[len];
        int i = s, j = s, k = 0;
        while(j < right){
            arr[k++] = a[i][j];
            j++;
        }
        
        while(i < bottom){
            arr[k++] = a[i][j];
            i++;
        }
        while(j> s){
            arr[k++] = a[i][j];
            j--;
        }
        while(i > s){
            arr[k++] = a[i][j];
            i--;
        }
        return arr;
        
    } 
    
    public static void reverse(int[] a, int i, int j ){
        while(i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        
    }
    
    public static void rotate(int[]a, int r ){
        r = r%a.length;
        if(r < 0 ){
            r += a.length;
        }
        reverse(a, 0, a.length - r - 1 );
        reverse(a,  a.length - r, a.length - 1);
        reverse(a, 0, a.length - 1);
        
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