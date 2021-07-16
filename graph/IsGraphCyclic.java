import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

        boolean[] visited = new boolean[vtces];
        for (int i = 0; i < vtces; i++) {
            if (!visited[i]) {
                boolean cyclic = bfs(graph, visited, i);
                if (cyclic) {
                    System.out.println(cyclic);
                    return;
                }
            }
        }
        System.out.println(false);

    }

    private static boolean bfs(ArrayList<Edge>[] graph, boolean[] visited, int src) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        while (q.size() > 0) {
            int vertices = q.poll();
            if (visited[vertices]) return true;
            visited[vertices] = true;
            for (Edge e : graph[vertices]) {
                if (!visited[e.nbr])
                    q.offer(e.nbr);
            }
        }
        return false;
    }


}