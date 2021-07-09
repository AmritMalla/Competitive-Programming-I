import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    smallestNumber(str);
    
 }
 
 public static void smallestNumber(String str){
    Stack<Integer> st = new Stack<>();
    int x = 1;
    for(int i = 0;i<str.length();i++){
        st.push(x);
        x++;
        if(str.charAt(i) == 'i'){
            while(!st.empty()){
                System.out.print(st.pop());
            }
        }
    }     
    
    st.push(x);
    while(!st.empty()){
        System.out.print(st.pop());
    }

 }
}
