package Day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSGraph {
    List<List<Integer>> graph;
    int V;
    DFSGraph(int V){
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
    void dfs(int start){
        boolean[] visited=new boolean[V];
        Stack<Integer> stack=new Stack<>();
        stack.push(start);
        System.out.println("Dfs starting from "+start+":");
        while (!stack.isEmpty()){
            int node=stack.pop();
            if (!visited[node]){
                visited[node]=true;
                System.out.print(node+" ");
                for (int neighbour:graph.get(node)){
                    if(!visited[neighbour]){
                        stack.push(neighbour);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int V=5;//5 nodes
        DFSGraph g=new DFSGraph(V);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(3,4);
        g.printList();
        g.dfs(4);
    }
}