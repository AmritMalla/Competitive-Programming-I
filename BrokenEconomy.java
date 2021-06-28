import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    int d = Integer.parseInt(br.readLine());
    brokenEco(a, d);
  }
  public static void brokenEco(int[]a, int d) {
    int i = 0, j = a.length - 1;
    while (i <= j) {
      int mid = i + (j - i) / 2;
      if (a[mid] == d) {
        System.out.println(a[mid]);
        return;
      } else if (a[mid] > d ) {
        j = mid - 1;
      } else {
        i = mid + 1;
      }
    }
    System.out.println(a[i]);
    System.out.println(a[j]);
  }


}