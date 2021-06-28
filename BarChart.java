import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = 0;
    
    for(int i = 0;i<n;i++){
        arr[i] = scn.nextInt();
        max = Math.max(arr[i], max);
    }
    for(int i = max;i> 0;i--){
        for(int j = 0;j<n;j++){
            if(arr[j] >= i ){
                System.out.print("*\t");
            }else System.out.print("\t");
            
        }
        System.out.println();
    }
    
 }

}