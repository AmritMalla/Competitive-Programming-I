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
        
        if(sr == dr && sc == dc){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if(sr > dr || sc > dc){
            return new ArrayList<String>();
        }
        ArrayList<String> right = getMazePaths(sr, sc+ 1, dr, dc);
        ArrayList<String> bottom = getMazePaths(sr + 1, sc, dr, dc);
        ArrayList<String> res = new ArrayList();
        for(String r: right){
            res.add('h' + r);
        }
        for(String b: bottom){
            res.add('v' + b);
        }
        return res;
    }

  public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr == dr && sc == dc){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        ArrayList<String> hpath = new ArrayList();
        ArrayList<String> vpath = new ArrayList();
        // call horizontal path if you are not in the last column
        if(sc < dc){
            hpath = getMazePaths(sr, sc+ 1, dr, dc);
        }
        //call vertical path if you are not in the last row
        if(sr < dr){
            vpath = getMazePaths(sr + 1, sc, dr, dc);
        }
        ArrayList<String> res = new ArrayList();
        for(String r: hpath){
            res.add('h' + r);
        }
        for(String b: vpath){
            res.add('v' + b);
        }
        return res;
    }
}
