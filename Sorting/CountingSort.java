import java.io.*;
import java.util.*;

public class Main {

  public static void countSort(int[] arr, int min, int max) {
      int range = max - min + 1;
      int[] freq = new int[range];
      for(int i: arr){
        freq[i - min]++;
      }
      for(int i = 1;i<range;i++){
          freq[i] += freq[i-1];
      }
      
      int[] ans = new int[arr.length];
      for(int i = arr.length - 1;i>= 0;i--){
          int val = arr[i];
          int idx = freq[val - min] - 1;
          freq[val - min]--;
          ans[idx] = val;
      }
      
      for(int i = 0;i<arr.length;i++){
          arr[i] = ans[i];
      }
      
      
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}