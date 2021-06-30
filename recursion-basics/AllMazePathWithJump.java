import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt(); 
        ArrayList<String> paths = getMazePaths(1, 1 , n, m);
        System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        //base case
        
        if(sr == dr && sc == dc){
            ArrayList<String> list = new ArrayList();
            list.add("");
            return list;
        }
        
        ArrayList<String> paths = new ArrayList();
        
        for(int j = sc + 1;j <= dc;j++){
            ArrayList<String> vpaths = getMazePaths(sr, j, dr, dc);
            for(String p: vpaths){
                paths.add("h" + (j - sc) + p);
            }
        }
        
        for(int i = sr + 1;i<=dr;i++){
            ArrayList<String> hpaths = getMazePaths(i, sc, dr, dc);
            for(String p: hpaths){
                paths.add("v" + (i - sr) + p);
            }
        }
        for(int i = sr + 1, j = sc + 1;i<=dr && j<= dc;i++, j++){
            ArrayList<String> dpaths = getMazePaths(i,j , dr, dc);
            for(String p: dpaths){
                paths.add("d" + (i - sr) + p);
            }
        }
        return paths;
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        //base case
        
        if(sr == dr && sc == dc){
            ArrayList<String> list = new ArrayList();
            list.add("");
            return list;
        }
        
        ArrayList<String> paths = new ArrayList();
        
        for(int j = 1;j <= dc - sc ;j++){
            ArrayList<String> vpaths = getMazePaths(sr, sc + j, dr, dc);
            for(String p: vpaths){
                paths.add("h" + j + p);
            }
        }
        
        for(int i =  1;i<= dr - sr;i++){
            ArrayList<String> hpaths = getMazePaths(sr +i, sc, dr, dc);
            for(String p: hpaths){
                paths.add("v" + i + p);
            }
        }
        for(int i = 1, j = 1;i<= (dr - sr) && j<= (dc - sc);i++, j++){
            ArrayList<String> dpaths = getMazePaths(sr + i,sc + j , dr, dc);
            for(String p: dpaths){
                paths.add("d" + i + p);
            }
        }
        return paths;
    }


}