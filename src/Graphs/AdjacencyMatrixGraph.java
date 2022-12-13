package Graphs;

//Program to find if the corresponding numbers are adjacent in a Graph
public class AdjacencyMatrixGraph {
    int adjMatrix[][];
    int noOfVertices;
    public AdjacencyMatrixGraph(int noOfVertices){
        this.adjMatrix=new int[noOfVertices][noOfVertices];//like 5*5 matrix
        this.noOfVertices=noOfVertices;
    }
    void addEdge(int source,int dest){ // add Edge with the source and destination
        adjMatrix[source][dest]=1;
        adjMatrix[dest][source]=1;
    }

    void removeEdge(int source,int dest){
        adjMatrix[source][dest]=0;
        adjMatrix[dest][source]=0;

    }

    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("  :- 1 2 3 4 5 ");
        sb.append("\n");
        for(int i=1;i< noOfVertices;i++){
            sb.append(i +" :- ");
            for(int j=1;j< noOfVertices;j++) {
                sb.append( adjMatrix[i][j]+" ");
            }
           // for(int eachCell:adjMatrix[i]){
             //   sb.append(eachCell + " ");
            //}
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        AdjacencyMatrixGraph graph=new AdjacencyMatrixGraph(6);
        graph.addEdge(1,5);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(4,5);
        graph.addEdge(2,4);
        graph.addEdge(5,3);
        System.out.println(graph.toString());
    }
}
