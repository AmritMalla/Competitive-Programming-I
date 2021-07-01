import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        int n = chess.length;
        if(row == n){
            System.out.println(qsf + ".");
            return;
        }
        
        for(int j = 0;j<n;j++){
            if(canNotKill(chess, row, j)){
                chess[row][j] = 1;
                printNQueens(chess, qsf + row + "-" + j + ", ", row + 1);
                chess[row][j] = 0;
            }
        }
        
    }
    
    public static boolean canNotKill(int[][] chess, int row, int col){
        
        for(int i = row - 1, j = col;i>= 0;i-- ){
            if(chess[i][j] == 1 ) return false;
        }
        
        for(int i = row - 1, j = col-1; i>= 0 && j>= 0;i--, j-- ){
            if(chess[i][j] == 1 ) return false;
        }
        
        for(int i = row -1, j = col + 1; i>= 0 && j< chess.length; i--,j++){
            if(chess[i][j] == 1 ) return false;
        }
        return true;
        
    }
}