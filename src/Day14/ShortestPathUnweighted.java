package Day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathUnweighted {
    ArrayList<ArrayList<Integer>> graph;
    int V;
    ShortestPathUnweighted(int V){
        this.V = V;
        graph = new ArrayList<>();
        for(int i = 0; i < V; i++){
            graph.add(new ArrayList<>());
        }
    }
    void addEdge(int u, int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    void shortestPath(int src){
        int[] dist=new int[V];
        Arrays.fill(dist,-1);
        Queue<Integer> q=new LinkedList<>();
        q.offer(src);
        dist[src]=0;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int neighbor:graph.get(node)){
                if(dist[neighbor]==-1){
                    dist[neighbor]=dist[node]+1;
                    q.offer(neighbor);
                }
            }
        }
        System.out.println("Shortest distance from node "+src+" : "+dist[src]);
        System.out.println(Arrays.toString(dist));
    }
    public static void main(String[] args) {
        int V=5;
        ShortestPathUnweighted g= new ShortestPathUnweighted(V);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(0,3);
        g.addEdge(3,4);

        g.shortestPath(4);
    }
}
