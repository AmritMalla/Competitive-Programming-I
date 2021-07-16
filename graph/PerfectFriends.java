import java.io.*;
import java.util.*;

public class Main {
    static class Edge{
        int from;
        int to;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        // write your code here
        ArrayList<Edge>[] graph = new ArrayList[n];

        for(int i = 0;i<n;i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0;i<k;i++){
            String[] s = br.readLine().split(" ");
            int from = Integer.parseInt(s[0]);
            int to = Integer.parseInt(s[1]);
            graph[from].add(new Edge(from, to));
        }

        ArrayList<Integer> connectedNodeCount = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for(int i = 0;i<n;i++){
            if(!visited[i]){
                int count = dfs(graph, i, visited);
                connectedNodeCount.add(count);
            }
        }

        int res = 0;
        for(int i = 0;i<connectedNodeCount.size()-1;i++){
            for(int j = i + 1;j<connectedNodeCount.size();j++){
                res += connectedNodeCount.get(i) * connectedNodeCount.get(j);
            }
        }
        System.out.println(res);
    }

    private static int dfs(ArrayList<Edge>[] graph, int i, boolean[] visited) {
        if(visited[i]) return 0;
        visited[i] = true;
        int res = 1;
        for(Edge e: graph[i]){
            if(!visited[e.to]){
                res += dfs(graph, e.to, visited);
            }
        }
        return res;
    }


}