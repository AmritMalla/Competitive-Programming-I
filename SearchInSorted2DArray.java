import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                a[i][j] = input.nextInt();
            }
        }
        int x = input.nextInt();
        
        int i = 0, j = n-1;
        while(i< n && j >= 0){
            if(a[i][j] == x ){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(a[i][j] > x ){
                --j;
            }else ++i;
        }
        System.out.println("Not Found");
        
    }
    

}