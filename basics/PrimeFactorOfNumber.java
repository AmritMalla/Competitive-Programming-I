import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  
  for(int i = 2;i<=n;i++){
      while(n % i == 0){
          System.out.print(i + " ");
          n = n/i;
          
      }
  }
 }
}