import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static class Edge {

        int source;

        int dest;

        int weight;

        public Edge(int source, int dest, int weight) {
            this.source = source;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int vces = 7;
        ArrayList<Edge>[] graph = new ArrayList[7];
        for (int i = 0; i < 7; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 3, 40));
        graph[0].add(new Edge(0, 1, 10));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 2, 10));

        graph[2].add(new Edge(2, 3, 10));
        graph[2].add(new Edge(2, 1, 10));

        graph[3].add(new Edge(3, 0, 40));
        graph[3].add(new Edge(3, 2, 10));
        graph[3].add(new Edge(3, 4, 2));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 3));
        graph[4].add(new Edge(4, 6, 3));

        graph[5].add(new Edge(4, 4, 3));
        graph[5].add(new Edge(4, 6, 3));

        graph[5].add(new Edge(5, 5, 3));
        graph[5].add(new Edge(5, 4, 8));
    }
}