import java.util.*;
  
  public class IsNumberPrime{
      
      public static boolean isPrime(int n){
          for(int i = 2;i*i <= n;i++){
              if(n %i == 0) return false;
          }
          return true;
      }
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
        
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            if(isPrime(n)){
                System.out.println("prime");
            }else System.out.println("not prime");
        }
  
   }
  }