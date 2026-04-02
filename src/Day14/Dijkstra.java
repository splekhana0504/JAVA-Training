package Day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra {
    ArrayList<ArrayList<int[]>> graph;
    int V;
    Dijkstra(int V){
        this.V=V;
        graph=new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
    }
    void addEdge(int u,int v,int w){
        graph.get(u).add(new int[]{v,w});
        graph.get(v).add(new int[]{u,w});
    }
    void dijkstra(int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return 0;
            }
        });
        pq.offer(new int[]{src, 0});
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int d = cur[0], node = cur[1];
            if (d > dist[node]) continue;

            for (int[] edge : graph.get(node)) {
                int nei = edge[0],weight = edge[1];
                if (dist[node] + weight < dist[nei]) {
                    dist[nei] = dist[node] + weight;
                    pq.offer(new int[]{dist[nei], nei});
                }
            }
        }
        System.out.println("Shortest Distance from Node: "+src+":");
        System.out.println(Arrays.toString(dist));
    }
    public static void main(String[] args) {
        int V=5;
        Dijkstra g=new Dijkstra(V);
        g.addEdge(0,1,2); //u,v,w
        g.addEdge(0,2,4);
        g.addEdge(1,2,1);
        g.addEdge(1,3,7);
        g.addEdge(2,4,3);
        g.addEdge(3,4,1);

        g.dijkstra(0);
    }
}
