package com.izzat.ds.graph.list;

import java.util.*;

public class GraphForList {
    ArrayList<GraphNodeList> graphNodes;

    public GraphForList(ArrayList<GraphNodeList> graphNodes) {
        this.graphNodes = graphNodes;
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNodeList first = graphNodes.get(i);
        GraphNodeList second = graphNodes.get(j);
        first.neighbours.add(second);
        second.neighbours.add(first);
    }

    private void bfsVisit(GraphNodeList node) {
        LinkedList<GraphNodeList> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNodeList currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.println(currentNode.name + " ");
            currentNode.neighbours.forEach(neighbour -> {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                }
            });
        }
    }

    private void bfsVisit2(GraphNodeList node) {
        Queue<GraphNodeList> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNodeList currentNode = queue.poll();
            currentNode.isVisited = true;
            System.out.println(currentNode.name + " ");
            currentNode.neighbours.forEach(neighbour -> {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                }
            });
        }
    }

    public void bfs() {
        graphNodes.forEach(node -> {
            if (!node.isVisited) bfsVisit2(node);
        });
    }

    //single source short path algorithms

    private void pathPrint(GraphNodeList node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    private void pathPrintSpecific(GraphNodeList node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    public void BFSForShortPath(GraphNodeList node) {
        LinkedList<GraphNodeList> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNodeList currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print("Printing path for node " + currentNode.name + ": ");
            pathPrint(currentNode);
            System.out.println();
            currentNode.neighbours.forEach(neighbour -> {
                if (!neighbour.isVisited) {
                    neighbour.parent = currentNode;
                    neighbour.isVisited = true;
                    queue.add(neighbour);
                }
            });
        }
    }

    public void BFSForShortPathSpecific(GraphNodeList nodeFrom, GraphNodeList nodeTo) {
        LinkedList<GraphNodeList> queue = new LinkedList<>();
        queue.add(nodeFrom);
        while (!queue.isEmpty()) {
            GraphNodeList currentNode = queue.remove(0);
            currentNode.isVisited = true;
            if (currentNode.equals(nodeTo)) {
                System.out.print("Path from " + nodeFrom.name + " to " + nodeTo.name + " :");
                pathPrintSpecific(currentNode);
                //pathPrint(currentNode);
                break;
            }
            currentNode.neighbours.forEach(neighbour -> {
                if (!neighbour.isVisited) {
                    neighbour.parent = currentNode;
                    neighbour.isVisited = true;
                    queue.add(neighbour);
                }
            });
        }
    }

    @Override
    public String toString() {
        StringBuilder graph = new StringBuilder();
        for (int i = 0; i < graphNodes.size(); i++) {
            graph.append(graphNodes.get(i).name).append(": ");
            for (int j = 0; j < graphNodes.get(i).neighbours.size(); j++) {
                if (j == graphNodes.get(i).neighbours.size() - 1)
                    graph.append(graphNodes.get(i).neighbours.get(j).name);
                else
                    graph.append(graphNodes.get(i).neighbours.get(j).name)
                            .append(" -> ");
            }
            graph.append("\n");
        }
        return graph.toString();
    }
}
