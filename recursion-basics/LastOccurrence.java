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
        System.out.println(lastIndex(a, 0, x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length) return -1;
        int li = lastIndex(arr, idx + 1, x);
        if(li != -1) return li;
        if(arr[idx] == x)return idx;
        return -1;
    }

}