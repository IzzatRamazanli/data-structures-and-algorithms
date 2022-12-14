package com.izzat.ds.graph.matrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    ArrayList<GraphNodeMatrix> graphNodes;
    int[][] adjacencyMatrix;

    public Graph(ArrayList<GraphNodeMatrix> graphNodes) {
        this.graphNodes = graphNodes;
        adjacencyMatrix = new int[graphNodes.size()][graphNodes.size()];
    }

    public void addUndirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    //get neighbours
    private List<GraphNodeMatrix> getNeighbours(GraphNodeMatrix node) {
        List<GraphNodeMatrix> neighbours = new ArrayList<>();
        int nodeIndex = node.index;
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1)
                neighbours.add(graphNodes.get(i));
        }
        return neighbours;
    }

    // BSF internal
    private void bfsVisit(GraphNodeMatrix node) {
        LinkedList<GraphNodeMatrix> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNodeMatrix currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.println(currentNode.name + " ");
            List<GraphNodeMatrix> neighbours = getNeighbours(currentNode);
            neighbours.forEach(neighbour -> {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                }
            });
        }
    }

    public void bfs() {
        graphNodes.forEach(node -> {
            if (!node.isVisited) bfsVisit(node);
        });
    }

    private void pathPrint(GraphNodeMatrix node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    public void BFSForShortPath(GraphNodeMatrix node) {
        LinkedList<GraphNodeMatrix> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNodeMatrix currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print("Printing path for node " + currentNode.name + ": ");
            pathPrint(currentNode);
            System.out.println();
            List<GraphNodeMatrix> neighbours = getNeighbours(currentNode);
            neighbours.forEach(neighbour -> {
                if (!neighbour.isVisited) {
                    neighbour.isVisited = true;
                    neighbour.parent = currentNode;
                    queue.add(neighbour);
                }
            });
        }
    }

    @Override
    public String toString() {
        StringBuilder graph = new StringBuilder();
        graph.append("   ");
        for (GraphNodeMatrix graphNode : graphNodes) {
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
