package com.izzat.graph.list;

import java.util.ArrayList;

public class GraphNodeList {
    public String name;
    public int index;

    public ArrayList<GraphNodeList> neighbours;

    public GraphNodeList(String name, int index) {
        this.name = name;
        this.index = index;
        neighbours = new ArrayList<>();
    }
}
