package com.izzat.graph.dijkstra;

import java.util.ArrayList;

public class AlgoMain {
    public static void main(String[] args) {
        ArrayList<WeightedGraphNode> nodes = new ArrayList<>();
        nodes.add(new WeightedGraphNode("A", 0));
        nodes.add(new WeightedGraphNode("B", 1));
        nodes.add(new WeightedGraphNode("C", 2));
        nodes.add(new WeightedGraphNode("D", 3));
        nodes.add(new WeightedGraphNode("E", 4));
        nodes.add(new WeightedGraphNode("F", 5));
        nodes.add(new WeightedGraphNode("G", 6));

        WeightedGraph graph = new WeightedGraph(nodes);

        graph.addWeightedEdge(0, 1, 2);
        graph.addWeightedEdge(0, 2, 5);
        graph.addWeightedEdge(1, 2, 6);
        graph.addWeightedEdge(1, 3, 1);
        graph.addWeightedEdge(1, 4, 3);
        graph.addWeightedEdge(2, 5, 8);
        graph.addWeightedEdge(3, 5, 4);
        graph.addWeightedEdge(4, 6, 9);
        graph.addWeightedEdge(5, 6, 7);

        graph.dijkstra(nodes.get(0));

    }
}
