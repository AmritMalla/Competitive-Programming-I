import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ways = waysOfTiling(n);
        System.out.println(ways);
    }
    
    public static int waysOfTiling(int n){
        int a = 1, b = 1, i = 1;
        
        while(i < n){
            int c = a + b;
            a = b;
            b = c;
            i++;
        }
        return b;
    }
}