package com.izzat.recursion.practice;

public class SumOfDigits {

    //iterative approach
    public static int iterativeCalculation(int number) {
        if (number < 0) return -1;
        int sum = 0;
        for (int i = number; i > 0; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }

    //recursive approach
    public static int recursiveCalculation(int number) {
        if (number < 0) return -1;
        if (number == 0) return number;
        return number % 10 + recursiveCalculation(number / 10);
    }

}
