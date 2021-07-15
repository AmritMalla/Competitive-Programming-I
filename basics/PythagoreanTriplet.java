import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner input = new Scanner(System.in);
    long a = input.nextLong();
    long b = input.nextLong();
    long c = input.nextLong();
    
    if(a * a == (b * b + c * c) || b * b == ( a * a + c * c ) || c * c == (a * a + b * b)){
        System.out.println("true");
    }else
        System.out.println("false");
    
   }
  }