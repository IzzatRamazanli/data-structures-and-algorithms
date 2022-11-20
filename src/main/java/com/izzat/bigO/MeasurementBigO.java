package com.izzat.bigO;

public class MeasurementBigO {
    //rule1 - any assigment statements and if statements that are executed once
    //of the size of the problem - O(1)

    //rule2 - a simple for loop from 0 to n (without internal loop) - O(n)

    //rule3 - a nested loop - O(n^2)

    //rule4 - a loop, in which the controlling parameter is divided by two at each step - O(logn)

    //rule 5 - when dealing with multiple statements , just add them up

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        System.out.println(findBiggestNumber(arr));
    }

    public static int findBiggestNumber(int[] arr) {
        int max = arr[0]; // O(1)
        for (int i = 0; i < arr.length; i++) {//O(n)
            if (arr[i] > max) { //O(1)
                max = arr[i];//O(1)
            }
            //final complexity for whole if block is O(1)
            //final complexity for whole for block is O(n)
        }
        return max; //O(1)
        //final complexity for whole function O(1)+O(n)+O(1) is  O(n)
    }
}
