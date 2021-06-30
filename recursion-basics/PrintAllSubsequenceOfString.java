import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        printSubSeq(str, "");
    }

     public static void printSubSeq(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        printSubSeq(str.substring(1), ans + str.charAt(0));
        printSubSeq(str.substring(1), ans);
    }

    public static void printSS(String str, StringBuilder ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        ans.append(str.charAt(0));
        printSS(str.substring(1), ans);
        ans.setLength(ans.length() - 1);
        printSS(str.substring(1), ans);
    }

}