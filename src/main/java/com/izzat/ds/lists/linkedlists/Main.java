package com.izzat.ds.lists.linkedlists;

import com.izzat.ds.lists.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        Employee izzat = new Employee(1, "Izzat", "Ramazannli");
        Employee jane = new Employee(2, "Jane", "Johns");
        Employee john = new Employee(3, "John", "Doe");
        Employee mike = new Employee(4, "Mike", "Wilson");

        employees.addFirst(izzat);
        employees.addFirst(jane);
        employees.addFirst(john);
        employees.addFirst(mike);

        employees.forEach(System.out::println);

    }
}
