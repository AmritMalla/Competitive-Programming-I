import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       int res = 0, carry = 0, s, m = 1;
       while(n1 > 0 || n2 > 0 || carry > 0){
           s = (n1 % 10) + (n2 % 10) + carry;
           carry = s/b;
           res += m * (s%b);
           n1 /= 10;
           n2 /=10;
           m *= 10;
       }
       return res;
   }
  }