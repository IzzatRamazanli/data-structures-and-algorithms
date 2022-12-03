package com.izzat.graph.list;

import java.util.ArrayList;

public class GraphNode {
    public String name;
    public int index;

    public ArrayList<GraphNode> neighbours;

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
        neighbours = new ArrayList<>();
    }
}
