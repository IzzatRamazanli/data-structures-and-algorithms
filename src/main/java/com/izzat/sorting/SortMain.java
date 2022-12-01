package com.izzat.sorting;

import com.izzat.sorting.bucketsort.BucketSort;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 2, 6, 9, 7, 8};
        //1 . int[] sortedArr = BubbleSort.bubbleSort(arr);
        //2 . int[] sortedArr = SelectionSort.selectionSort(arr);
        //3 .int[] sortedArr = InsertionSort.insertionSort(arr);
        //int[] sortedArr = BucketSort.bucketSort(arr);
        //MergeSort.mergeSort(arr, 0, arr.length - 1);
        //MergeSort2.mergeSort(arr,0, arr.length);
        QuickSort.quickSort(arr, 0, arr.length - 1);
        //System.out.println(Arrays.toString(sortedArr));
        System.out.println(Arrays.toString(arr));
    }
}
