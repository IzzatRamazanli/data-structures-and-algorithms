package com.izzat.algos.sorting;

public class Swapper {

    public static void swap(int[] arr, int actual, int taken) {
        if (actual == taken) return;
        int temp = arr[actual];
        arr[actual] = arr[taken];
        arr[taken] = temp;
    }//swap method
}
