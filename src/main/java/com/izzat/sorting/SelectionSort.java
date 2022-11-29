package com.izzat.sorting;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minimumIndex])
                    minimumIndex = j;
            }
            if (minimumIndex != i) {
                Swapper.swap(arr, i, minimumIndex);

                /*int temp = a[i];
                 * a[i] = a[minimumIndex];
                 * a[minimumIndex] = temp;*/
            }
        }
        return arr;
    }
}
