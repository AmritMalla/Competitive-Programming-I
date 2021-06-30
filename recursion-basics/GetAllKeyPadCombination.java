import java.io.*;
import java.util.*;

public class Main {
    
    private static String[] keys = new String[]{
       ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" 
    };

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        ArrayList<String> res = getKPC(str);
        System.out.println(res);
    }

    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> res = new ArrayList();
            res.add("");
            return res;
        }
        ArrayList<String> rres = getKPC(str.substring(1));
        ArrayList<String> res = new ArrayList();

        for(char c: keys[str.charAt(0) - '0'].toCharArray()){
            for(int i = 0;i<rres.size();i++){
                res.add(c + rres.get(i));
            }
        }
        return res;
    }

}