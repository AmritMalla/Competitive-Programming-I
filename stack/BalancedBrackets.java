import java.io.*;
import java.util.*;

public class Main {

    public static boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
           if(c == '(' || c == '{' || c == '['){
               st.push(c);
           }else if(c == ')'){
               if(st.empty() || st.pop() != '(') return false;
           }else if(c == '}'){
               if(st.empty() || st.pop() != '{') return false;
           }else if(c == ']'){
               if(st.empty() || st.pop() != '[') return false;
           }
        }
        return st.empty();
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        boolean ans = isBalanced(A);
        System.out.println(ans);
    }

}