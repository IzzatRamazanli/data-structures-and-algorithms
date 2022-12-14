package com.izzat.ds.lists.linkedlists.doubly;

import com.izzat.ds.lists.Employee;

public class DoublyMain {
    public static void main(String[] args) {
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        Employee izzat = new Employee(1, "Izzat", "Ramazannli");
        Employee jane = new Employee(2, "Jane", "Johns");
        Employee john = new Employee(3, "John", "Doe");
        Employee mike = new Employee(4, "Mike", "Wilson");

        list.addToEnd(izzat);
        list.addToEnd(jane);
        list.addToEnd(john);
        list.addToEnd(mike);

        list.print();
        //list.removeFromFront();
        EmployeeNode employeeNode = list.removeFromEnd();
        System.out.println("\n"+employeeNode.getEmployee().firstName());
        list.print();
    }
}
