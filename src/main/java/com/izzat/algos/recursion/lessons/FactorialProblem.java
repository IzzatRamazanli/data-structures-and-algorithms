package com.izzat.algos.recursion.lessons;

public class FactorialProblem {

    public static long factorialRecursive(int num) {
        if (num < 0) return -1;
        if (num == 0 || num == 1) return 1;
        else {
            return num * factorialRecursive(num - 1);
        }
    }

    public static long factorialIterative(int num) {
        if (num < 0) return -1;
        long result = 1;
        for (int i = num; i > 0; i--) {
            result = result * i;
        }
        return result;
    }
}
