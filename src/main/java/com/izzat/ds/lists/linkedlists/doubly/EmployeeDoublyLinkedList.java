package com.izzat.ds.lists.linkedlists.doubly;

import com.izzat.ds.lists.Employee;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) return null;
        EmployeeNode removedNode = head;
        if (head.getNext() == null) tail = null;
        else head.getNext().setPrevious(null);
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) return null;
        EmployeeNode removedNode = tail;
        if (tail.getPrevious() == null) head = null;
        else tail.getPrevious().setNext(null);
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public void print() {
        EmployeeNode current = head;
        System.out.print("Head <-> ");
        while (current != null) {
            System.out.print(current.getEmployee().firstName());
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.print("null");
    }
}
