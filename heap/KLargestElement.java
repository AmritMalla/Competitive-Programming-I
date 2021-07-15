import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int k = Integer.parseInt(br.readLine());
        printKLargest(arr, k);
    }

    private static void printKLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int a: arr){
            minHeap.add(a);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        while (minHeap.size() > 0){
            System.out.println(minHeap.poll());
        }


    }

}