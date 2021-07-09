
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    
    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time

        Arrays.sort(arr, Comparator.comparing(a -> a[0]));
        Deque<Integer[]> st = new LinkedList<>();
        st.offer(new Integer[]{arr[0][0], arr[0][1]});
        for(int i = 1;i<arr.length;i++){
            if(st.peekLast()[1] >= arr[i][0]){
                st.peekLast()[1] = Math.max(st.peekLast()[1], arr[i][1]);
            }else{
                st.offer(new Integer[]{arr[i][0], arr[i][1]});
            }
        }
        while(st.size() > 0){
            Integer[] r = st.remove();
            System.out.println(r[0] + " " + r[1]);

        }

    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time

        Arrays.sort(arr, Comparator.comparing(a -> a[0]));
        int a = arr[0][0], b = arr[0][1];
        for(int i = 1;i<arr.length;i++){
            if(b >= arr[i][0]){
                b = Math.max(b, arr[i][1]);
            }else{
                System.out.println(a + " " + b);
                a = arr[i][0];
                b = arr[i][1];
            }
        }
        System.out.println(a + " " + b);
    }
}
