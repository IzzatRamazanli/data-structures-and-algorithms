package com.izzat.ds.tree;

public class TreeMain {
    public static void main(String[] args) {
        Tree integerTree = new Tree();
        integerTree.insert(25);
        integerTree.insert(20);
        integerTree.insert(15);
        integerTree.insert(27);
        integerTree.insert(30);
        integerTree.insert(29);
        integerTree.insert(26);
        integerTree.insert(22);
        integerTree.insert(32);
        System.out.println(integerTree);
    }
}
