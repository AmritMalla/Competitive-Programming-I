import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
    
        int digitCount = 0;
        int temp = n;
        while(temp != 0){
            temp = temp/10;
            digitCount++;
        }
    
        int div = (int)Math.pow(10, digitCount - 1);
    
         while(div != 0){
              System.out.println(n/div);
              n = n%div;
              div = div/10;
         }
     }
    }