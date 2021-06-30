import java.io.*;
import java.util.*;

public class Main {
    
     private static String[] keys = new String[]{
       ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" 
    };

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        printKPC(str, "");
    }

    public static void printKPC(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0);
        for(char c: keys[ch - '0'].toCharArray()){
            printKPC(str.substring(1),asf + c );
        }
        
        
    }

}