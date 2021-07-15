import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        
        int a = n1, b = n2;
        while(b != 0){
            int c = a % b;
            a = b;
            b = c;
        }
        
        System.out.println(a);
        System.out.println(n1 * n2/ a);
        
        
      
     }
    }