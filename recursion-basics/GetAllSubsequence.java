import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        List<String> res = gss1(s);
        System.out.println(res);
    }


    public static ArrayList<String> gss1(String str){
        if(str.length() == 0){
            ArrayList<String> list = new ArrayList();
            list.add("");
            return list;
        }
        ArrayList<String> list = gss1(str.substring(1));
        int sz = list.size();
        for(int i = 0;i<sz;i++){
            list.add(str.charAt(0) + list.get(i));
        }
        return list;
    }

    public static ArrayList<String> gss(String str) {
        ArrayList<String> list = new ArrayList();
        gss(str, 0, list, new StringBuilder());
        return list;
    }
    
    public static void gss(String str,int i,  ArrayList<String> list, StringBuilder sb){
        if(i == str.length()){
            list.add(sb.toString());
            return;
        }
        gss(str,i + 1, list, sb );
        sb.append(str.charAt(i));
        gss(str, i+1, list, sb);
        sb.setLength(sb.length() - 1);
        
    }

}