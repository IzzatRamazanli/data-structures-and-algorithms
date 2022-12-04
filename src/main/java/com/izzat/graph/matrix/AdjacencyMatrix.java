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
        graphNodes.add(new GraphNodeMatrix("F", 5));
        graphNodes.add(new GraphNodeMatrix("G", 6));

        Graph graph = new Graph(graphNodes);
        graph.addUndirectedEdge(0, 1);
        graph.addUndirectedEdge(0, 2);
        graph.addUndirectedEdge(1, 3);
        graph.addUndirectedEdge(1, 6);
        graph.addUndirectedEdge(2, 3);
        graph.addUndirectedEdge(2, 4);
        graph.addUndirectedEdge(3, 5);
        graph.addUndirectedEdge(4, 5);
        graph.addUndirectedEdge(5, 6);
        System.out.println(graph);

        graph.BFSForShortPath(graphNodes.get(0));

    }

    private static void graphExample1() {
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
