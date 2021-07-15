import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner input = new Scanner(System.in);
     int n = input.nextInt();
     int size = 0;
     int temp = n;
     while(temp != 0){
         temp/=10;
         size++;
     }
     int k = input.nextInt();
     
     k = k%size;
     if(k < 0) k +=size;
     int div = 1, mul = 1;
     for(int i = 1;i<= size;i++){
         if(i <= k){
             div *= 10;
         }else mul *= 10;
     }
     
     int q = n % div;
     n = n/div + q * mul;

     System.out.println(n);
    }
   }