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
        
        for(int i = 0;i<n;i++){
            int minPoint = 0, minValue = a[i][0];
            for(int j = 1;j<n;j++){
                if(a[i][j] < minValue  ){
                    minValue = a[i][j];
                    minPoint = j;
                }
            }
            
            int k = 0;
            for(;k<n;k++){
                if( a[k][minPoint]  > minValue ){
                    break;
                }
            }
            
            if(k == n){
                System.out.println(a[i][minPoint] );
                return;
            }
        }
        System.out.println("Invalid input");
    }
    

}