package com.izzat.recursion;


public class RecursionExamples {
    public static void main(String[] args) {
        lessThan(5);
    }

    //approach 1
    public static int arraySum(int[] arr, int length) {
        if (length == 1) return arr[0];
        int sum = arraySum(arr, length - 1);
        sum = sum + arr[length - 1];
        return sum;
    }

    //approach 2
    public static int arraySum2(int[] arr, int length) {
        if (length <= 0) return 0;
        return arraySum(arr, length - 1) + arr[length - 1];
    }

    public static void lessThan(int num) {
        if (num < 1) System.out.println("Number less than 1");
        else {
            System.out.println(num);
            lessThan(num - 1);
        }
    }
}
