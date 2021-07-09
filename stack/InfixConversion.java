import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        convertInfix(exp);
    }

    public static void convertInfix(String exp) {
        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                ops.push(ch);
            } else if (Character.isDigit(ch) || Character.isAlphabetic(ch)) {
                pre.push(ch + "");
                post.push(ch + "");
            } else if (ch == ')') {
                while (ops.peek() != '(') {
                    process(pre, post, ops);
                }
                ops.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (ops.size() > 0 && ops.peek() != '(' && precedence(ch) <= precedence(ops.peek())) {
                    process(pre, post, ops);
                }
                ops.push(ch);
            }
        }
        while (ops.size() > 0) {
            process(pre, post, ops);
        }

        System.out.println(post.peek());
        System.out.println(pre.peek());

    }

    private static void process(Stack<String> pre, Stack<String> post, Stack<Character> ops) {
        char op = ops.pop();
        String prev2 = pre.pop();
        String prev1 = pre.pop();
        pre.push(op + prev1 + prev2);

        String postv2 = post.pop();
        String postv1 = post.pop();
        post.push(postv1 + postv2 + op);
    }

    public static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 0;
        else return 1;
    }
}
