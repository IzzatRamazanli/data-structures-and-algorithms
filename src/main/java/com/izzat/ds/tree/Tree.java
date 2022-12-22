package com.izzat.ds.tree;

public class Tree {
    private TreeNode root;

    public void insert(int value) {
        if (root == null) root = new TreeNode(value);
        else root.insert(value);
    }

    public void traverseInOrder() {
        if (root != null) root.traverseInOrder();
    }

    @Override
    public String toString() {
        return "Tree{root=%s}".formatted(root);
    }
}
