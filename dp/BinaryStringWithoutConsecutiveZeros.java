import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    
    if(n == 0){
        System.out.println(0);
        return;
    }
    
    int first = 0, second = 1;
    int x = n + 2;
    while(--x> 0){
        int third = first + second;
        first = second; 
        second = third;
    }
    
    System.out.println(second);
       
 }
}