import java.io.*;
import java.util.*;

public class Main {
    
    public static void printIfPalindrome(String s){
        int i = 0, j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return;
            i++;
            j--;
        }
        System.out.println(s);
    }

	public static void solution(String str){

        for(int i = 0;i<str.length();i++){
            for(int j = i + 1;j<=str.length();j++){
                printIfPalindrome(str.substring(i, j));
            }
        }	    
	    	
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}