import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner input = new Scanner(System.in);
    int n1 = input.nextInt();
    int[] arr1 = new int[n1];
    for(int i = 0;i<n1;i++){
        arr1[i] = input.nextInt();
    }
    
    int n2 = input.nextInt();
    int[] arr2 = new int[n2];
    for(int i = 0;i<n2;i++){
        arr2[i] = input.nextInt();
    }
    
    int size = Math.max(n1, n2);
    int[] arr = new int[size];
    int c = 0;
    
    for(int i = n1-1, j = n2-1, k = size-1;k>=0;i--,j--,k--){
        int d1 = i>=0?arr1[i]:0;
        int d2 = j>=0?arr2[j]:0;
        int d = d1 + d2 + c;
        c = d/10;
        arr[k] = d%10;
        
    }
    
    if(c != 0){
        System.out.println(c);
    }
    
    for(int i :arr){
        System.out.println(i);
    }
    
 }

}