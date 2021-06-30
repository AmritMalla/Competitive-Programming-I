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
        System.out.println(maxOfArray(a, 0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length) return -1;
        return Math.max(arr[idx], maxOfArray(arr, idx + 1));
    }

}