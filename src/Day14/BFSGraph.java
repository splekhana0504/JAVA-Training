package Day14;

import java.util.*;

public class BFSGraph {
    List<List<Integer>> graph;
    int V;
    BFSGraph(int V){
        this.V=V;
        graph=new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
    }
    public void addEdge(int u,int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    void printList(){
        System.out.println("Adjacency List:");
        for (int i=0;i<V;i++){
            System.out.print(i+"->");
            for (int n: graph.get(i)){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
   void bfs(int start){
        boolean[] visited=new boolean[V];
       Queue<Integer> queue=new LinkedList<>();
       visited[start]=true;
       queue.add(start);
       System.out.println("BFS starting from "+start+" ");
       while(!queue.isEmpty()){
           int node=queue.poll();
           System.out.print(node+" ");
           for(int neighbour:graph.get(node)){
               if(!visited[neighbour]){
                   visited[neighbour]=true;
                   queue.offer(neighbour);
               }
           }
       }
       System.out.println();
   }
    public static void main(String[] args) {
        int V=5;//5 nodes
        BFSGraph g=new BFSGraph(V);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(3,4);
        g.printList();
        g.bfs(0);
    }
}
