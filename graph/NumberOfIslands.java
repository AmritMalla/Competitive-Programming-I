import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            String parts = br.readLine();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
            }
        }

        boolean[][] visited = new boolean[m][n];

        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0 &&  !visited[i][j] ) {
                    res++;
                    floodFill(arr, visited, i, j);
                }
            }
        }
        System.out.println(res);
    }


    private static void floodFill(int[][] arr, boolean[][] visited, int i, int j) {
        if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length || visited[i][j] || arr[i][j] == 1) return;
        visited[i][j] = true;
        floodFill(arr, visited, i - 1, j);
        floodFill(arr, visited, i, j - 1);
        floodFill(arr, visited, i, j + 1);
        floodFill(arr, visited, i + 1, j);

    }

}