import java.util.*;

public class PrintAllPrimeUptoN{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for(int i = low;i<=high;i++){
            boolean isPrime = true;
            for(int j = 2;j* j <= i;j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}