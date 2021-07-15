import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int prev = 0, next = 1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(prev + "\t");
                int x = next + prev;
                prev = next;
                next = x;
            }
            System.out.println();
        }
        // write ur code here

    }
}