package Day14;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    List<List<Integer>> graph;
    int V;
    AdjacencyList(int V){
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
        for(int i=0;i<V;i++){
            System.out.print(i+"-> ");
            for(int n:graph.get(i)){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int V=5;
        AdjacencyList g=new AdjacencyList(V);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(3,4);
        g.printList();
    }
}
