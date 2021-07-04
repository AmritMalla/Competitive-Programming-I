import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        
        int ways = paintFence(n, k);
        System.out.println(ways);
    }
    
    public static int paintFence(int n, int k){
        int same = 0, diff = k, total = k;
        
        for(int i = 1;i<n;i++){
            same = diff;
            diff = total * (k - 1);
            total = same + diff;
        }
        
        return total;
        
    }
}