
import java.io.*;
import java.util.*;

public class Main{



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<String> post = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<Integer> val = new Stack<>();

        for(int i = exp.length() - 1;i>= 0;i--){
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)){
                post.push(ch + "");
                infix.push(ch + "");
                val.push(ch - '0');
            }else{
                String pv1 = post.pop();
                String pv2 = post.pop();
                post.push(pv1 + pv2 + ch);

                String iv1 = infix.pop();
                String iv2 = infix.pop();
                infix.push("(" + iv1 + ch + iv2 + ")");

                int v1 = val.pop();
                int v2 = val.pop();
                val.push(operate(v1, v2, ch));
            }
        }
        System.out.println(val.peek());
        System.out.println(infix.peek());
        System.out.println(post.peek());
    }
    public static int operate(int iv1, int iv2, char op){
        switch (op){
            case '+':
                return iv1 + iv2;
            case '-':
                return iv1 - iv2;
            case '*':
                return iv1 * iv2;
            case '/':
                return iv1 / iv2;
        }
        return 0;
    }
}
