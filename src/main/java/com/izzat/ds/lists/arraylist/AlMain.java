package com.izzat.ds.lists.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Izzat", "Ramazannli"));
        employees.add(new Employee(2, "Jim", "Jones"));
        employees.add(new Employee(3, "John", "Doe"));
        employees.add(new Employee(4, "Mike", "Wilson"));

        employees.forEach(System.out::println);

        Employee[] employeeArray = employees.toArray(new Employee[0]);
        Arrays.stream(employeeArray).forEach(System.out::println);

        System.out.println(employees.contains(new Employee(1, "Izzat", "Ramazannli")));
    }
}
