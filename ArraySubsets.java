import java.io.*;
import java.util.*;

public class Main {

  public static void printSubset(int[] a){
     
     int size = (int)Math.pow(2, a.length);
     for(int i = 0;i<size;i++){
         int x = size>>1;
         for(int j = 0;j<a.length;j++){
             if((x&i) == x){
                 System.out.print(a[j] + "\t");
             }else{
                 System.out.print("-\t");
             }
             x = x>>1;
         }
         System.out.println();
     }
      
  }
  
  public static void printSubset1(int[]a){
      int size = (int)Math.pow(2, a.length);
      for(int i = 0;i<size;i++){
          int temp = i;
          String s = "";
          for(int j = 0;j<a.length;j++){
              int r = temp%2;
              temp = temp/2;
              if(r == 1){
                  s = a[a.length - j - 1] + "\t" + s;
              }else{
                  s = "-\t" + s;
              }
          }
          System.out.println(s);
      }
  }

    

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }
    printSubset1(a);

  }

}