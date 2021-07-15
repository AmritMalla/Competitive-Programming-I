import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0;i<n1;i++){
            arr1[i] = input.nextInt();

        }
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0;i<n2;i++){
            arr2[i] = input.nextInt();

        }

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int a: arr1){
            hashMap.put(a,hashMap.getOrDefault(a, 0) + 1);
        }

        for(int a: arr2){
            if(hashMap.containsKey(a)){
                System.out.println(a);
                if(hashMap.get(a) == 1){
                    hashMap.remove(a);
                }else{
                    hashMap.put(a, hashMap.get(a) - 1);
                }
            }
        }
    }

}