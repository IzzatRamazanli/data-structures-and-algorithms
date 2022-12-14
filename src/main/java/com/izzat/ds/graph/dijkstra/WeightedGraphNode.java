package com.izzat.ds.graph.dijkstra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WeightedGraphNode implements Comparable<WeightedGraphNode> {
    public String name;
    public int index;
    public WeightedGraphNode parent;
    public boolean isVisited;
    public int distance;
    public List<WeightedGraphNode> neighbours;
    public HashMap<WeightedGraphNode, Integer> cost;

    public WeightedGraphNode(String name, int index) {
        this.name = name;
        this.index = index;
        isVisited = false;
        distance = Integer.MAX_VALUE;
        neighbours = new ArrayList<>();
        cost = new HashMap<>();
    }

    @Override
    public String toString() {
        return "WeightedGraphNode{name='%s'}".formatted(name);
    }

    @Override
    public int compareTo(WeightedGraphNode o) {
        return this.distance - o.distance;
    }
}
