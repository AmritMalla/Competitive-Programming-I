import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     // write your code here
     int res = 0, pow = 1;
     while(n1 > 0){
         int temp = n2;
         int c = 0;
         int d1 = n1 % 10;
         n1 /= 10;
         int r1 = 0, p = 1;
         
         while(temp > 0 || c > 0){
            int d2 = temp % 10;
            int v = d1 * d2 + c;
            r1 += p * (v % b);
            c = v /b;
            temp /= 10;
            p *= 10;
         }
         
         r1 *= pow;
         pow *= 10;
         
         res = add(b, res, r1);
         // add res + r1 * 10;
     }
     return res;
 }
 
 public static int add(int b, int n1, int n2){
     int res = 0, c = 0, pow = 1;
     while(n1 > 0 || n2 > 0 || c> 0){
         int d1 = n1%10;
         int d2 = n2 % 10;
         n1/= 10;
         n2 /= 10;
         int x = d1 + d2 + c;
         res += pow * (x % b );
         c = x/b;
         pow *= 10;
     }
     return res;
 }

}