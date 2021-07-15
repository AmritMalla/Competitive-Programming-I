import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int space = n/2, num = 1, start = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("\t");
            }
            int val = start;
            for(int j = 1;j<=num;j++){
                System.out.print(val + "\t");
                if(j <= num/2){
                    val++;
                }else val--;
            }
            System.out.println();
            
            if(i <= n/2){
                space--;
                num +=2;
                start++;
            }else{
                space++;
                num-=2;
                start--;
            }
            
        }

    }
}