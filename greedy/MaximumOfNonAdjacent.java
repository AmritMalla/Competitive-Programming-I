import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = input.nextInt();
        }
        
        int exclude = 0, include = arr[0];
        for(int i = 1;i<n;i++){
            int nInclude = exclude + arr[i];
            int nExclude = Math.max(exclude, include);
            include = nInclude;
            exclude = nExclude;
        }
        
        System.out.println(Math.max(include, exclude));
    }
}