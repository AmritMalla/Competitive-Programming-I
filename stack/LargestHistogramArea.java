
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

        // code
        int ans = getMaxArea1(a);
        System.out.println(ans);
    }

    public static int getMaxArea(int[] a){
        int ans = 0, n = a.length;
        Stack<Integer> st = new Stack();
        for(int i = 0;i<a.length;i++){
            while(!st.empty() && a[st.peek()] > a[i]){
                int height = a[st.pop()];
                int width = i - (st.empty() ? 0: st.peek() + 1);
                ans = Math.max(ans, height * width);
            }
            st.push(i);
        }

        while(!st.empty()){
            int height = a[st.pop()];
            int width = n -(st.empty() ? 0: st.peek() + 1);
            ans = Math.max(ans, height * width);
        }
        return ans;
    }

    public static int getMaxArea1(int[]a){
        int[] nse = nextSmaller(a);
        int[] pse = prevSmaller(a);

        int res = 0;
        for(int i = 0;i<a.length;i++){
            res = Math.max((nse[i] - pse[i] - 1) * a[i], res);
        }
        return res;
    }

    //parallel traversal
    public static int[] nextSmaller(int[] a){
        int[] nse = new int[a.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<a.length;i++){
            
            while (!st.empty() && a[st.peek()] > a[i]){ // no equals sign
                nse[st.pop()] = i;
            }
            st.push(i);
        }
        while(!st.empty()){
            nse[st.pop()] = a.length;
        }

        return nse;
    }

    //anti-parallel traversal
    public static int[] prevSmaller(int[] a){
        int[] pse = new int[a.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<a.length;i++){
            while(!st.empty() && a[st.peek()] >= a[i]){ // equals sign
                st.pop();
            }
            if(st.empty()){
                pse[i] = -1;
            }else{
                pse[i] = st.peek();
            }
            st.push(i);
        }
        return pse;
    }
}