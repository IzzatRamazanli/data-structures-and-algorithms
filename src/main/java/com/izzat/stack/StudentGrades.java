package com.izzat.stack;

import java.util.Comparator;
import java.util.Stack;

class Student {
    int id;
    int grade;

    public Student(int id, int grade) {
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{id=%d, grade=%d}".formatted(id, grade);
    }
}

public class StudentGrades {

    public static void main(String[] args) {

        Student student1 = new Student(1, 90);
        Student student2 = new Student(2, 80);
        Student student3 = new Student(3, 100);
        Stack<Student> s = new Stack<>();
        s.push(student1);
        s.push(student2);
        s.push(student3);

        s.sort(compByGrade);

        s.forEach(System.out::println);

        double avg = s.stream()
                .mapToInt(x -> x.grade)
                .average()
                .orElse(-1);
        System.out.println("Avg of Grades: " + avg);

        int maxPoint = s.stream()
                .mapToInt(x -> x.grade)
                .max()
                .orElse(-1);

        Student student11 = s.stream()
                .filter(x -> x.grade == maxPoint)
                .findFirst()
                .orElse(null);

        System.out.println("Student with highest grade:" + student11);

    }
    private static final Comparator<Student> compByGrade = Comparator.comparingInt(x -> x.grade);
}
