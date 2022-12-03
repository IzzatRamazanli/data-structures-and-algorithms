package com.izzat.graph;

public class GraphNode {
    public String name;
    public int index;

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }

    @Override
    public String toString() {
        return "GraphNode{name='%s', index=%d}".formatted(name, index);
    }
}
