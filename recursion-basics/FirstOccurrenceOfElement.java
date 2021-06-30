import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = input.nextInt();
        }
        int x = input.nextInt();
        System.out.println(firstIndex(a, 0, x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length) return -1;
        if(arr[idx] == x) return idx;
        else return firstIndex(arr, idx + 1, x);
    }

}