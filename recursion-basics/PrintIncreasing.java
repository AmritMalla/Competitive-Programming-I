import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        if(n == 0) return;
        printDecreasing(n-1);
        System.out.println(n);
    }

}