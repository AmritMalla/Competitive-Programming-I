import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean isPrime(int n){
        if(n == 1) return true;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3;i * i <= n;i+= 2){
            if(n % i == 0) return false;
        }
        return true;
        
    }

	public static void solution(ArrayList<Integer> al){
		for(int i = al.size() - 1;i>= 0;i--){
		    if(isPrime(al.get(i))){
		        al.remove(i);
		    }
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}