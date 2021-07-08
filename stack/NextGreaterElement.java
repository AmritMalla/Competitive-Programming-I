import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve1(a);
    display(nge);
 }
 
 //traversing left to right
 
 public static int[] solve1(int[] arr){
     int[] ans = new int[arr.length];
     Stack<Integer> st = new Stack();
     for(int i = 0;i<arr.length;i++){
         while(!st.empty() && arr[st.peek()] < arr[i]){
             ans[st.peek()] = arr[i];
             st.pop();
         }
         st.push(i);
     }
     while(!st.empty()){
         ans[st.pop()] = -1;
     }
     return ans;
 }
// Traversing right to left
 public static int[] solve(int[] arr){
   int[] ans = new int[arr.length];
   Stack<Integer> st = new Stack();
   for(int i = arr.length-1;i>= 0;i--){
        while(!st.empty() && st.peek() < arr[i]){
            st.pop();
        }
       if(st.empty()){
           ans[i] = -1;
       }else{
            ans[i] = st.peek();
       }
       st.push(arr[i]);
   }
   return ans;
 }

}