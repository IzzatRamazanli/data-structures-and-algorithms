package com.izzat.ds.lists.linkedlists.singly;

import com.izzat.ds.lists.Employee;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) return null;
        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void print() {
        EmployeeNode current = head;
        System.out.print("Head: ");
        while (current != null) {
            System.out.print(current.getEmployee().firstName());
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public EmployeeNode getHead() {
        return head;
    }

    public int size() {
        return size;
    }
}
