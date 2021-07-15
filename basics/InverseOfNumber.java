import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int ans = 0;
  int i = 1;
  while(n != 0){
    int place = n%10;
    ans += (int)Math.pow(10, place - 1) * i;
    i++;
    n = n/10;
  }
  System.out.println(ans);
 }
}