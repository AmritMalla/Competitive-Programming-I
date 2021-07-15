
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner input = new Scanner(System.in);
    int n1 = input.nextInt();
    int[] a1 = new int[n1];
    for(int i = 0;i<n1;i++){
        a1[i] = input.nextInt();
    }
    
    int n2 = input.nextInt();
    int[] a2 = new int[n2];
    for(int i = 0;i<n2;i++){
        a2[i] = input.nextInt();
    }
    
    int c = 0;
    int[] diff = new int[n2];
    for(int i = n2-1, j = n1-1;i>=0;i--,j--){
        int d2 = a2[i] + c;
        c = 0;
        int d1 = j>=0?a1[j]:0;
        if(d1 > d2){
            d2 += 10;
            c = -1;
        }
        diff[i] = d2 - d1;
    }
    
    int i = 0;
    while(i < n2 && diff[i] == 0) ++i;
    while(i < n2){
        System.out.println(diff[i++]);
    }
    
 }

}