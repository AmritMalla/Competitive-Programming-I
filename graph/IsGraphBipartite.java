import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
 *       ----------   Bipartite Graph -----------
 * A graph is said to be bipartite if and only if the sets of vertices of graph can be divided
 * into two mutually exclusive and exhaustive subsets such that all the edges lies across the subsets.
 *
 * For a graph to be bipartite
 *       1. Either the graph should be acyclic
 *       2. Or the number of vertices in the cycle should be even
 * */

public class Main {

    static class Edge {

        int src;

        int nbr;

        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
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
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        int[] visited = new int[vtces];
        Arrays.fill(visited, -1);
        for (int src = 0; src < vtces; src++) {
            if (visited[src] == -1) {
                boolean bipartite = checkBipartite(graph, visited, src);
                if (bipartite == false) {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }

    private static boolean checkBipartite(ArrayList<Edge>[] graph, int[] visited, int src) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(src);

        int level = 0;
        while (queue.size() > 0){
            int width = queue.size();
            for(int i = 0;i<width;i++){
                int vertex = queue.poll();
                if(visited[vertex] != -1){
                    if(visited[vertex]%2 != level%2) return false;
                }else{
                    visited[vertex] = level;
                }
                for(Edge e: graph[vertex]){
                    if(visited[e.nbr] == -1){
                        queue.offer(e.nbr);
                    }
                }
            }
            level++;
        }
        return true;
    }



}