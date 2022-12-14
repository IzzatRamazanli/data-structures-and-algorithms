package com.izzat.algos.recursion.practice;

public class SumOfDigits {

    public static int iterativeSum(int number) {
        if (number < 0) return -1;
        int sum = 0;
        for (int i = number; i > 0; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }

    public static int recursiveSum(int number) {
        if (number < 0) return -1;
        if (number == 0) return number;
        return number % 10 + recursiveSum(number / 10);
    }

}
