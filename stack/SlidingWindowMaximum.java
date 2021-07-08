import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    windowMax(a, k);
    // code
 }
 
 public static void windowMax(int[] a, int k){
    
    int[] nge = nextGreater(a);
    int j = 0;
    for(int i = 0;i<=a.length - k;i++){
        if(j < i) j = i;
        while(nge[j] < i + k ){
            j = nge[j];
        }
        System.out.println(a[j]);
    }

 }
 
 public static int[] nextGreater(int[] a){
     int[] nge = new int[a.length];
     Stack<Integer> st = new Stack();
     for(int i = a.length - 1;i>= 0;i--){
        while(!st.isEmpty() && a[st.peek()] <= a[i]){
            st.pop();
        }
        nge[i] = st.empty()?a.length: st.peek();
        st.push(i);
     }
     return nge;
 }
 
 
}