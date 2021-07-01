import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] arr = new int[n + 1];
    int res = fib(n, arr);
    System.out.println(res);
 }
 
 public static int fib(int n,int[] arr){
     if(n < 2) 
        return n;
    if(arr[n] != 0) return arr[n];
    arr[n] = fib(n-1, arr) + fib(n-2, arr);
    return arr[n];
 }

}