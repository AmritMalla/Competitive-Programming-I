
import java.io.*;
import java.util.*;

public class ExitPointOfMatrix {
    
    public static void print(int i, int j){
        System.out.println(i);
        System.out.println(j);
    }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] a = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        a[i][j] = scn.nextInt();
      }
    }
    
    int i = 0, j = 0;
    
    int dir = 0;
    while(true){
        
        dir = (dir + a[i][j]) % 4;
        
        if(dir == 0){
            j++; // east
        }else if(dir == 1){
            i++; // south
        }else if(dir == 2){
            j--; // west
        }else{
            i--; // north
        }
        
        if(i < 0){
            print(0, j);
            break;
        }else if(j < 0){
            print(i, 0);
            break;
        }else if(i == n){
            print(i-1, j);
            break;
        }else if(j == m){
            print(i, j-1);
            break;
        }
    }
    
    
  }

}
