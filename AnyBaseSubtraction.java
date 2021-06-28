import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int res = 0, c = 0, p = 1;
       while(n2 > 0){
           int d1 = n1 % 10;
           int d2 = n2 % 10 + c;
           c = 0;
           if(d1 > d2){
               d2 += b;
               c -= 1;
           }
           
           res += (d2 - d1) * p;
           p *= 10;
           n1 /= 10;
           n2 /= 10;
       }
       return res;
   }
  
  }