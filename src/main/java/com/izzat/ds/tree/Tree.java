package com.izzat.ds.tree;

public class Tree {
    private TreeNode root;

    public void insert(int value) {
        if (root == null) root = new TreeNode(value);
        else root.insert(value);
    }

    @Override
    public String toString() {
        return "Tree{root=%s}".formatted(root);
    }
}
