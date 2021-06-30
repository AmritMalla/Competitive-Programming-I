import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n <0){
            return new ArrayList<String>();
        }
        if(n == 0){
            ArrayList<String> list = new ArrayList();
            list.add("");
            return list;
        }
        ArrayList<String> paths1 = getStairPaths(n-1);
        ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);
        ArrayList<String> paths = new ArrayList();
        
        for(String s: paths1){
            paths.add("1" + s);
        }
        for(String s: paths2){
            paths.add("2" + s);
        }
        for(String s: paths3){
            paths.add("3" + s);
        }
        return res;
        
    }

}