import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        printPermutations(str,"" );
    }

    public static void printPermutations(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        
        for(int i = 0;i<str.length();i++){
            String left = str.substring(0, i) + str.substring(i + 1);
            printPermutations(left, asf + str.charAt(i));
        }
        
    }

}