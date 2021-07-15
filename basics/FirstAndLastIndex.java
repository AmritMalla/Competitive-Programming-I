import java.io.*;
import java.util.*;

public class Main{

public static int firstIndex(int[] a , int d){
    int lo = 0, hi = a.length-1;
    int res = -1;
    while(lo <= hi){
        int mid = lo + (hi - lo)/2;
        if(a[mid] == d){
            res = mid;
            hi = mid - 1;
        }else if(a[mid] > d){
            hi  = mid -1;
        }else  {
            lo = mid + 1;
        }
    }
    return res;
}

public static int lastIndex(int[] a , int d){
    int lo = 0, hi = a.length-1;
    int res = -1;
    while(lo <= hi){
        int mid = lo + (hi - lo)/2;
        if(a[mid] > d){
            hi = mid - 1;
        }else if(d == a[mid]){
            res = mid;
            lo = mid + 1;
        }else{
            lo = mid + 1;
        }
    }
    return res;
}


public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    
    int d = Integer.parseInt(br.readLine());
    System.out.println(firstIndex(a, d));
    System.out.println(lastIndex(a,d));
 }

}