import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int  destBase= scn.nextInt();
      
      int decimal = toBase10(n, sourceBase);
      int res = decimalToBaseB(decimal, destBase);
      System.out.println(res);
    
   }   
   
   public static int toBase10(int n, int b){
       int res = 0, mul = 1;
       while(n > 0){
           res += (n % 10) * mul;
           n /=10;
           mul *= b;
       }
       return res;
   }
   
   public static int decimalToBaseB(int n, int b){
       int res = 0, mul = 1;
       while(n>0){
           res += (n%b) * mul;
           n /= b;
           mul *= 10;
       }
       return res;
   }
   
  }