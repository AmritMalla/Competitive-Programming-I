import java.io.*;
import java.util.*;

public class Main {

    public static boolean isDuplicateBrackets(String s){
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == ')'){
                if(st.peek() == '(') return true;
                while(st.pop() != '(');
            }else {
                st.push(c);
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        boolean ans = isDuplicateBrackets(A);
        System.out.println(ans);
    }

}