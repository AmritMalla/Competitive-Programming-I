import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int n = str.length();
        int a = 0, b = 0, c = 0;
        
        for(int i = 0;i<n;i++){
            char ch = str.charAt(i);
            if( ch == 'a'){
                a = 2 * a + 1;
            }else if(ch  == 'b'){
                b = 2 * b + a;
            } else if( ch  == 'c'){
                c = c * 2 + b;
            }
        }
        System.out.println(c);
    }
}