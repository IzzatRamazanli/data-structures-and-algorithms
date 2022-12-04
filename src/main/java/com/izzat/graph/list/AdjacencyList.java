package com.izzat.graph.list;

import java.util.ArrayList;

public class AdjacencyList {
    public static void main(String[] args) {
        ArrayList<GraphNodeList> graphNodes = new ArrayList<>();

        graphNodes.add(new GraphNodeList("A", 0));
        graphNodes.add(new GraphNodeList("B", 1));
        graphNodes.add(new GraphNodeList("C", 2));
        graphNodes.add(new GraphNodeList("D", 3));
        graphNodes.add(new GraphNodeList("E", 4));
        graphNodes.add(new GraphNodeList("F", 5));
        graphNodes.add(new GraphNodeList("G", 6));

        GraphForList graph = new GraphForList(graphNodes);
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
        //graph.BFSForShortPath(graphNodes.get(0));
        graph.BFSForShortPathSpecific(graphNodes.get(0), graphNodes.get(6));

    }

    private static void graphExample1() {
        ArrayList<GraphNodeList> graphNodes = new ArrayList<>();

        graphNodes.add(new GraphNodeList("A", 0));
        graphNodes.add(new GraphNodeList("B", 1));
        graphNodes.add(new GraphNodeList("C", 2));
        graphNodes.add(new GraphNodeList("D", 3));
        graphNodes.add(new GraphNodeList("E", 4));

        GraphForList graph = new GraphForList(graphNodes);
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
