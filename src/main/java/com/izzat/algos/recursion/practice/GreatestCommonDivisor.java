package com.izzat.algos.recursion.practice;

public class GreatestCommonDivisor {

    public static int recursiveGCD(int num1, int num2) {
        if (num1 < 0 || num2 < 0) return -1;
        if (num2 == 0) return num1;
        return recursiveGCD(num2, num1 % num2);
    }

}
