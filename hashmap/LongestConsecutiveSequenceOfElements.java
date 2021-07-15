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
        sortKSorted1(arr, k);
        /*
        for(int r: arr){
            System.out.println(r);
        }*/
        
    }

    private static void sortKSorted1(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0;i<arr.length;i++){
            minHeap.add(arr[i]);
            if(minHeap.size() > k && k > 0){
                System.out.println(minHeap.poll());
            }
        }
        while(minHeap.size() > 0){
            System.out.println(minHeap.poll());
        }
    }

    private static void sortKSorted(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0;i<arr.length;i++){
            minHeap.add(arr[i]);
            if(minHeap.size() > k && k > 0){
                arr[i - k] = minHeap.poll();
            }
        }
        int i = arr.length - k;
        while(minHeap.size() > 0){
            arr[i] = minHeap.poll();
            i++;
        }

    }

}