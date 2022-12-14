package com.izzat.algos.sorting;

public class QuickSort2 {
    public static void quickSort(int[] arr, int start, int end) {
        if (end - start < 2) return;
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot);
        quickSort(arr, pivot + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        //This is using 1st element as a pivot
        int pivot = arr[start];
        int i = start;
        int j = end;

        while (i < j) {
            //empty loop
            while (i < j && arr[--j] >= pivot) ;
            if (i < j) {
                arr[i] = arr[j];
            }
            //empty loop
            while (i < j && arr[++i] <= pivot) ;
            if (i < j) {
                arr[j] = arr[i];
            }
        }

        arr[j] = pivot;
        return j;
    }
}
