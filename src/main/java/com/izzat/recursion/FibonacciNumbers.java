package com.izzat.recursion;

public class FibonacciNumbers {

    public static int fibonacciSequence(int num) {
        if (num < 0) return 0;
        if (num == 0 || num == 1) return num;
        return fibonacciSequence(num - 1) + fibonacciSequence(num - 2);
    }
}
