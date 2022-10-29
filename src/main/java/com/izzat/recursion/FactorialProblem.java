package com.izzat.recursion;

public class FactorialProblem {

    public static void main(String[] args) {
        System.out.println(factorialRecursive(10));
    }

    public static long factorialRecursive(int num) {
        if (num == 0 || num == 1) return 1;
        else {
            return num * factorialRecursive(num - 1);
        }
    }

    public static long factorialIterative(int num) {
        long result = 1;
        for (int i = num; i > 0; i--) {
            result = result * i;
        }
        return result;
    }
}
