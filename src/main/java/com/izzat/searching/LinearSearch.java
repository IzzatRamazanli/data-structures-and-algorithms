package com.izzat.searching;

public class LinearSearch {

    public static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        System.out.println("Element does not exist");
        return -1;
    }

}
