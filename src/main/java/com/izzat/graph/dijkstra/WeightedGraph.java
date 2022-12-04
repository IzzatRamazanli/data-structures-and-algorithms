package com.izzat.graph.dijkstra;

import java.util.List;
import java.util.PriorityQueue;

public class WeightedGraph {
    public List<WeightedGraphNode> nodeList;

    public WeightedGraph(List<WeightedGraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addWeightedEdge(int i, int j, int cost) {
        WeightedGraphNode first = nodeList.get(i);
        WeightedGraphNode second = nodeList.get(j);
        first.neighbours.add(second);
        second.neighbours.add(first);
        first.cost.put(second, cost);
    }

    public void dijkstra(WeightedGraphNode node) {
        PriorityQueue<WeightedGraphNode> queue = new PriorityQueue<>();
        node.distance = 0;
        queue.addAll(nodeList);

        while (!queue.isEmpty()) {
            WeightedGraphNode currentNode = queue.remove();
            currentNode.isVisited = true;
            currentNode.neighbours.forEach(neighbour -> {
                if (queue.contains(neighbour)) {
                    if (neighbour.distance > currentNode.distance + currentNode.cost.get(neighbour)) {
                        neighbour.distance = currentNode.distance + currentNode.cost.get(neighbour);
                        neighbour.parent = currentNode;
                        queue.remove(neighbour);
                        queue.add(neighbour);
                    }
                }
            });
        }

        nodeList.forEach(nodeToCheck -> {
            System.out.print("Node " + nodeToCheck.name + ", distance: " + nodeToCheck.distance + " , Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        });

    }

    public void pathPrint(WeightedGraphNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }


}
