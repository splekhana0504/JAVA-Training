package Day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PrimsUnweighted {//in Prims ,cycle is not allowed
    int V;
    ArrayList<ArrayList<Integer>> graph;
    PrimsUnweighted(int V){
        this.V=V;
        graph=new ArrayList<>();
        for (int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
    }
    void addEdge(int u,int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    void primMST(int start){
        boolean[] inMST=new boolean[V];
        int[] parent=new int[V];
        Arrays.fill(parent,-1);
        Queue<Integer> q=new LinkedList<>();
        q.offer(start);
        inMST[start]=true;
        while (!q.isEmpty()){
            int u=q.poll();
            for (int v: graph.get(u)){
                if (!inMST[v]){
                    inMST[v]=true;
                    parent[v]=u;
                    q.offer(v);
                }
            }
        }
        System.out.println("Edges in the spanning tree:");
        for (int i=0;i<V;i++){
            if (parent[i]!=-1){
                System.out.println(parent[i]+" - "+i);
            }
        }
    }
    public static void main(String[] args) {
        PrimsUnweighted g=new PrimsUnweighted(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(3,4);

        g.primMST(0);//prim minimum spanning tree(MST)
    }
}