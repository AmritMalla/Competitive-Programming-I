import java.io.*;
import java.util.*;

public class Main {
    
    static int[][] moves = {{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] chess = new int[n][n];
        printKnightsTour(chess, row, col, 1);
    }
    
     public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        int n = chess.length;

        if( r < 0 || c < 0 || r >= n || c >= n || chess[r][c] != 0) return;
        
        chess[r][c] = upcomingMove;
        
        if(upcomingMove == n * n){
            displayBoard(chess);
        }else{
            for(int i = 0;i<8;i++)
                printKnightsTour(chess, r + moves[i][0], c + moves[i][1], upcomingMove + 1);
        }
        chess[r][c] = 0;
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        int n = chess.length;

        if( chess[r][c] != 0) return;
        
        chess[r][c] = upcomingMove + 1;
        
        if(upcomingMove + 1 == n * n){
            displayBoard(chess);
        }else{
            for(int i = 0;i<8;i++){
                int row = r + moves[i][0];
                int col = c + moves[i][1];
                if(row >= 0 && col >= 0 && row < n && col < n  ){
                    printKnightsTour(chess, row, col, upcomingMove + 1);
                }
            }
        }
        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}