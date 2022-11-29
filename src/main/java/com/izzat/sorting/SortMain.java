package com.izzat.sorting;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 2, 6};
        //1 . int[] sortedArr = BubbleSort.bubbleSort(arr);
        int[] sortedArr = SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
