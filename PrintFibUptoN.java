import java.util.*;
  
  public class PrintFibUptoN{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int prev = 0, next = 1, i = 0;
      while(i < n){
          System.out.println(prev);
          int temp = prev + next;
          prev = next;
          next = temp;
          i++;
      }
   }
  }