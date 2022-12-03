package com.izzat.searching;

public class BinarySearch {
    public static int search(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;
        System.out.printf("start: %d middle: %d end: %d%n", start, middle, end);

        while (arr[middle] != value && start <= end) {
            if (value < arr[middle]) {
                end = middle - 1;
            } else start = middle + 1;

            middle = (start + end) / 2;
            System.out.printf("start: %d middle: %d end: %d%n", start, middle, end);
        }
        if (arr[middle] == value) return middle;
        return -1;
    }
}
