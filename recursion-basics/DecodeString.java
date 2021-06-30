import java.io.*;
import java.util.*;

public class Main {
    private static String keys = "aabcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        printEncodings(str, "");
    }

    public static void printEncodings(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        if(str.charAt(0) == '0') return;

        int first = str.charAt(0) - '0';
        if(str.length() == 1){
            printEncodings(str.substring(1), asf + keys.charAt(first));
            return;
        }
        int second = str.charAt(1) - '0';
        if(first < 2 || first == 2 && second <= 6 ){
            printEncodings(str.substring(1), asf + keys.charAt(first));
            printEncodings(str.substring(2), asf + keys.charAt(first * 10 + second));
            
        }else{
            printEncodings(str.substring(1), asf + keys.charAt(first));
        }
    }
}