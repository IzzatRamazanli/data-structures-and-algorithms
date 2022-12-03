package com.izzat.graph.matrix;

import java.util.ArrayList;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        ArrayList<GraphNodeMatrix> graphNodes = new ArrayList<>();
        graphNodes.add(new GraphNodeMatrix("A", 0));
        graphNodes.add(new GraphNodeMatrix("B", 1));
        graphNodes.add(new GraphNodeMatrix("C", 2));
        graphNodes.add(new GraphNodeMatrix("D", 3));
        graphNodes.add(new GraphNodeMatrix("E", 4));

        Graph graph = new Graph(graphNodes);
        graph.addUndirectedEdge(0, 1);
        graph.addUndirectedEdge(0, 2);
        graph.addUndirectedEdge(0, 3);
        graph.addUndirectedEdge(1, 4);
        graph.addUndirectedEdge(2, 3);
        graph.addUndirectedEdge(3, 4);

        System.out.println(graph);

        graph.bfs();


    }
}
