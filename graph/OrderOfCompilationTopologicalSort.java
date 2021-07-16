import java.io.*;
import java.util.*;

public class Main {
    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            graph[v1].add(new Edge(v1, v2));
        }

        Stack<Integer> res = new Stack<>();

        boolean[] visited = new boolean[vtces];

        for(int src = 0;src<vtces;src++){
            if(!visited[src]){
                topologicalSort(graph, visited, res, src);
            }
        }

        while (res.size() > 0){
            System.out.println(res.pop());
        }
        // write your code here
    }

    private static void topologicalSort(ArrayList<Edge>[] graph, boolean[] visited, Stack<Integer> res, int src) {
        visited[src] = true;
        for(Edge e: graph[src]){
            if(!visited[e.nbr]){
                topologicalSort(graph, visited, res, e.nbr);
            }
        }
        res.push(src);
    }

}