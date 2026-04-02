package Day14;

public class AdjacencyMatrix {
    int [][] graph;
    int V;
    AdjacencyMatrix(int V){
        this.V=V;
        graph=new int[V][V];
    }
    void addEdge(int u,int v){
        graph[u][v]=1;
        graph[v][u]=1; //Undirected graph
    }
    void printMatrix(){
        System.out.println("Adjacency Matrix");
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int V=6; //6 Nodes
        AdjacencyMatrix g=new AdjacencyMatrix(V);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.addEdge(2,4);
        g.addEdge(3,5);
        g.addEdge(4,5);

        g.printMatrix();
    }
}
