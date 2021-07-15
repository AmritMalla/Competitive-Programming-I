import java.io.*;
import java.util.*;

public class Main {
    
    public static int fact(int sz){
        if(sz < 2) return 1;
        int res = 1;
        while(sz > 1){
            res *= sz;
            sz--;
        }
        return res;
    }

	public static void solution(String str){
		int sz = fact(str.length());
		for(int x = 0;x<sz;x++){
    		StringBuilder sb = new StringBuilder(str);
    		StringBuilder res = new StringBuilder();
    		int a = x;
		    for(int i = str.length();i>0;i--){
                res.append(sb.charAt(a % i));	
                sb.deleteCharAt(a % i);
                a = a/i;
		    }
		    System.out.println(res);
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}