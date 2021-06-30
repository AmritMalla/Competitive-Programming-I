import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        toh(n, a, b, c);
    }

    public static void toh(int n, int ori, int dest, int help){
        if(n == 0) return;
        toh(n-1, ori, help, dest );
        System.out.println(n + "[" + ori + " -> " + dest + "]");
        toh(n-1, help, dest, ori);
    }

}