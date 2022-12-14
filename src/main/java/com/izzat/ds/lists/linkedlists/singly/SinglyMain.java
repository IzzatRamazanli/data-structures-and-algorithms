package com.izzat.ds.lists.linkedlists.singly;


import com.izzat.ds.lists.Employee;

public class SinglyMain {
    public static void main(String[] args) {
        Employee izzat = new Employee(1, "Izzat", "Ramazannli");
        Employee jane = new Employee(2, "Jane", "Johns");
        Employee john = new Employee(3, "John", "Doe");
        Employee mike = new Employee(4, "Mike", "Wilson");

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(izzat);
        list.addToFront(jane);
        list.addToFront(john);
        list.addToFront(mike);
        list.print();
        System.out.println(list.size());
        EmployeeNode employeeNode = list.removeFromFront();
        System.out.println(list.size());
        list.print();
    }
}
