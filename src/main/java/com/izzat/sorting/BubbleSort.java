package com.izzat.sorting;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {

                    Swapper.swap(arr, j, j + 1);

//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
