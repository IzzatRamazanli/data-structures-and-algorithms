package com.izzat.algos.sorting;

public class QuickSort {
    public static int partition(int[] arr, int start, int end) {
        //This is using the last element as pivot

        int pivot = arr[end];
        int i = start - 1; //take into account 0 index, cause using inside loop
        for (int j = start; j <= end; j++) {
            if (arr[j] <= pivot) {
                i++;
                //Swapper.swap(arr, i, j);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

}
