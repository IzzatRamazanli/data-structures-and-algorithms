package com.izzat.recursion.practice;

public class PowerOfNumber {

    public static int iterativePower(int num, int power) {
        if (num < 0 || power < 0) return -1;
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= num;
        }
        return result;
    }

    public static int recursivePower(int num, int power) {
        if (num < 0 || power < 0) return -1;
        if (power == 0) return 1;
        return num * recursivePower(num, power - 1);
    }
}
