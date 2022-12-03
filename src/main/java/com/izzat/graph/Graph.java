package com.izzat.graph;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    ArrayList<GraphNode> graphNodes;
    int[][] adjacencyMatrix;

    public Graph(ArrayList<GraphNode> graphNodes) {
        this.graphNodes = graphNodes;
        adjacencyMatrix = new int[graphNodes.size()][graphNodes.size()];
    }

    public void addUndirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    @Override
    public String toString() {
        StringBuilder graph = new StringBuilder();
        graph.append("   ");
        for (GraphNode graphNode : graphNodes) {
            graph.append(graphNode.name).append(" ");
        }
        graph.append("\n");
        for (int i = 0; i < graphNodes.size(); i++) {
            graph.append(graphNodes.get(i).name).append(": ");
            for (int j : adjacencyMatrix[i]) {
                graph.append(j).append(" ");
            }
            graph.append("\n");
        }
        return graph.toString();
    }

}
