package Day15;

import java.util.ArrayList;

public class CycleDetectionUnweighted {
    ArrayList<ArrayList<Integer>> graph;
    int V;

    CycleDetectionUnweighted(int V) {
        this.V = V;
        graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    boolean dfs(int node, boolean[] visited, int parent) {
        visited[node] = true;

        for (int nei : graph.get(node)) {
            if (!visited[nei]) {
                if (dfs(nei, visited, node)) {
                    return true;
                }
            } else if (nei != parent) {
                return true;
            }
        }
        return false;
    }

    boolean hasCycle() {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CycleDetectionUnweighted g = new CycleDetectionUnweighted(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);

        if (g.hasCycle()) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("No cycle detected");
        }
    }
}