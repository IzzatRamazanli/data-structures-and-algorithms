package com.izzat.ds.graph.list;

import java.util.ArrayList;

public class GraphNodeList {
    public String name;
    public int index;
    public boolean isVisited = false;

    public GraphNodeList parent;

    public ArrayList<GraphNodeList> neighbours;

    public GraphNodeList(String name, int index) {
        this.name = name;
        this.index = index;
        neighbours = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "GraphNodeList{name='%s', index=%d, isVisited=%s}".formatted(name, index, isVisited);
    }
}
