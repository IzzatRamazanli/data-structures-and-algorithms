package com.izzat.sorting;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int index = i;
            while (index > 0 && arr[index - 1] > temp) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = temp;
        }
        return arr;
    }
}
