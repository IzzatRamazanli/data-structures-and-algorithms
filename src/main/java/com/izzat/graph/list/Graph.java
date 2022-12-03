package com.izzat.graph.list;

import java.util.ArrayList;

public class Graph {
    ArrayList<GraphNode> graphNodes;

    public Graph(ArrayList<GraphNode> graphNodes) {
        this.graphNodes = graphNodes;
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNode first = graphNodes.get(i);
        GraphNode second = graphNodes.get(j);
        first.neighbours.add(second);
        second.neighbours.add(first);
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
