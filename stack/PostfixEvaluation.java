
import java.io.*;
import java.util.*;

public class Main{


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        evaluatePostfix(exp);
    }

    public static void evaluatePostfix(String exp){
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Integer> eval = new Stack<>();
        for(int i = 0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)){
                infix.push(ch + "");
                prefix.push(ch + "");
                eval.push(ch - '0');
            }else{
                String infixOpndv2 = infix.pop();
                String infixOpndv1 = infix.pop();
                infix.push("(" + infixOpndv1 + ch + infixOpndv2 + ")");

                String prev2 = prefix.pop();
                String prev1 = prefix.pop();
                prefix.push(ch + prev1 + prev2);

                int v2 = eval.pop();
                int v1 = eval.pop();
                eval.push(operate(v1, v2, ch));
            }
        }
        System.out.println(eval.peek());
        System.out.println(infix.peek());
        System.out.println(prefix.peek());
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
