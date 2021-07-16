import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

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

        int src = Integer.parseInt(br.readLine());
        HashSet<Integer> visited = new HashSet<>();
        printHamiltonian(graph, src, src, src + "", visited);
    }

    private static void printHamiltonian(ArrayList<Edge>[] graph, int os, int src, String path, HashSet<Integer> visited) {
        if (visited.size() + 1 == graph.length) {
            boolean isCycle = false;
            for (Edge e : graph[src]) {
                if (e.nbr == os) {
                    isCycle = true;
                }
            }
            if (isCycle) {
                System.out.println(path + "*");
            } else System.out.println(path + ".");
        }
        visited.add(src);
        for (Edge e : graph[src]) {
            if (!visited.contains(e.nbr)) {
                printHamiltonian(graph, os, e.nbr, path + e.nbr, visited);
            }
        }
        visited.remove(src);
    }
}