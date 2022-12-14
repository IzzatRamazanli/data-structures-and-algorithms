package com.izzat.algos.sorting;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            while (i > 0 && arr[i - 1] > temp) {
                arr[i] = arr[i - 1];
                i--;
            }
            arr[i] = temp;
        }
        return arr;
    }
}
