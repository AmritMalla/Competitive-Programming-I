import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int m = input.nextInt(); 
            printMazePaths(1, 1 , n, m, "");
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
		//call smart simple base case
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	        if(sr == dr && sc == dc){
	            System.out.println(psf);
	            return;
	        }
	        if(sc < dc) // can have one horizontal move
	            printMazePaths(sr, sc + 1, dr, dc, psf + "h");
	            
	        if(sr < dr) // can have one vertical move
	            printMazePaths(sr + 1, sc, dr, dc, psf + "v");
	       
	    }   

	    // call stupid Smart base case 
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	        if(sr > dr || sc > dc) return;
	        if(sr == dr && sc == dc){
	            System.out.println(psf);
	            return;
	        }
	        printMazePaths(sr, sc + 1, dr, dc, psf + "h");
            printMazePaths(sr + 1, sc, dr, dc, psf + "v");
	       
	    }   

	}