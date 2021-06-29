import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for(int i = 1;i<str.length();i++){
		    if(str.charAt(i) != sb.charAt(sb.length() - 1)){
		        sb.append(str.charAt(i));
		    }
		}

		return sb.toString();
	}
	
	public static String compression10(String str){
		// write your code here
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for(int i = 1;i<str.length();i++){
            char cur = str.charAt(i);
            char prev = str.charAt(i-1);
            if(cur != prev){
                sb.append(cur);
            }
		}

		return sb.toString();
	}

	public static String compression2(String str){
		StringBuilder sb = new StringBuilder();
		int count = 1;
		char prev = str.charAt(0);
		
		for(int i = 1;i<str.length();i++){
		    char cur = str.charAt(i);
		    if(prev == cur){
		        ++count;
		    }else{
		        sb.append(prev + ((count >1)?Integer.toString(count): ""));
		        count = 1;
		        prev = cur;
		    }
		}
		sb.append(prev + ((count >1)?Integer.toString(count): ""));
		return sb.toString();
	}
	
	public static String compression20(String str){
	    StringBuilder sb = new StringBuilder();
	    sb.append(str.charAt(0));
	    int count  = 1;
	    for(int i = 1;i<str.length();i++){
	        char prev = str.charAt(i-1);
	        char cur = str.charAt(i);
	        if(prev == cur){
	            count++;
	        }else{
	            if(count > 1){
	                sb.append(count);
	            }
	            sb.append(cur);
	            count = 1;
	            
	        }
	    }
	    
	    if(count > 1){
	        sb.append(count);
	    }
	    return sb.toString();
	}
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression10(str));
		System.out.println(compression20(str));
	}

}