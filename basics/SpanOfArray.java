import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn = new Scanner   (System.in);
    int n = scn.nextInt();
    int max= Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    for(int i = 0;i<n;i++){
        int x = scn.nextInt();
        max  = Math.max(x, max);
        min = Math.min(x, min);
    }
    
    System.out.println(max - min);
 }

}