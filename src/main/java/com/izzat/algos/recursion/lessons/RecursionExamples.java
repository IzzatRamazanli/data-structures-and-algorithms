package com.izzat.algos.recursion.lessons;


public class RecursionExamples {
    public static void main(String[] args) {
        //lessThan(5);

    }

    //iterative approach for palindrome check

    //text
    public static boolean isPalindrome(String txt) {
        String[] test = txt.split("");
        StringBuilder check = new StringBuilder();
        for (int i = test.length - 1; i >= 0; i--) {
            check.append(test[i]);
        }
        return check.toString().equals(txt);
    }

    //numbers
    public static boolean isPalindrome(int num) {
        int remainder;
        int result = 0;
        for (int x = num; x > 0; x /= 10) {
            remainder = x % 10;
            result *= 10;
            result = result + remainder;
        }
        return result == num;
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
            //System.out.println(num); 5 4 3 2 1
            lessThan(num - 1);
            System.out.println(num); // 1 2 3 4 5
        }
    }

    // Iterative approach versus recursive approach

    //1) Recursive solution
    public static int powerOfTwo(int num) {
        if (num == 0) return 1;
        else {
            int power = 2 * powerOfTwo(num - 1);
            return power;
        }
    }

    //2) Iterative solution
    public static int powerOfTwoIT(int num) {
        int inc = 0;
        int power = 1;
        while (num > inc) {
            power = power * 2;
            inc++;
        }
        return power;
    }
}
