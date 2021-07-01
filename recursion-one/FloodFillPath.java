import java.io.*;
import java.util.*;

public class Main {
    static int[][] dirx = {{-1,0}, {0,-1}, {1,0}, {0,1}};
    static char[] dir = {'t','l','d','r'};

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf) {
        int n = maze.length, m = maze[0].length;
        if(sr == n-1 && sc == m-1){
            System.out.println(asf);
            return;
        }
        maze[sr][sc] = 1;
        
        for(int k = 0;k<4;k++){
            int r = dirx[k][0] + sr;
            int c = dirx[k][1] + sc;
            if(r >= 0 && r < n && c >= 0 && c < m && maze[r][c] == 0 ){
                floodfill(maze, r, c, asf + dir[k]);
            }
        }
        maze[sr][sc] = 0;
    }

    public static void floodfill(int[][] maze, int sr, int sc, String asf) {
        int n = maze.length, m = maze[0].length;
        if(sr < 0 || sc < 0 || sr == n || sc == m || maze[sr][sc] == 1) return;
        if(sr == n-1 && sc == m-1){
            System.out.println(asf);
            return;
        }
        maze[sr][sc] = 1;
        
        for(int k = 0;k<4;k++){
            int r = dirx[k][0] + sr;
            int c = dirx[k][1] + sc;
            floodfill(maze, r, c, asf + dir[k]);
        }
        maze[sr][sc] = 0;
    }
}

