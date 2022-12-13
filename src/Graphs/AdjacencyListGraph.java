package Graphs;

import java.util.ArrayList;

public class AdjacencyListGraph { //Adjacency List of a graph vertex includes the list of all adjacent vertices to that vertex
    public static void main(String[] args) {
        int noOfVertices = 6;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < noOfVertices; i++) {
            adjList.add(new ArrayList<>());
        }
        AdjacencyListGraph graph = new AdjacencyListGraph();
        graph.addEdge(adjList, 1, 5);
        graph.addEdge(adjList, 1, 2);
        graph.addEdge(adjList, 1, 4);
        graph.addEdge(adjList, 2, 4);
        graph.addEdge(adjList, 4, 5);
        graph.addEdge(adjList, 5, 3);
        graph.printGraph(adjList);
    }

    void addEdge(ArrayList<ArrayList<Integer>> adjList, int source, int dest) {
        ArrayList<Integer> sourceList = adjList.get(source);
        sourceList.add(dest);
        ArrayList<Integer> destList = adjList.get(dest);
        destList.add(source);
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> adjList) {

        for (int i = 1; i < adjList.size(); i++) {
            System.out.print("Vertex"+i+" :-");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(" ->"+adjList.get(i).get(j));
            }
            System.out.println();
        }
//        for(ArrayList<Integer> connectedVerticesList:adjList) {
//
//            for(Integer eachCell:connectedVerticesList){
//                System.out.print(eachCell+"  -> ");
//            }
//            System.out.println();
//
//        }
    }
}
