package com.izzat.algos.searching;

import java.util.Arrays;

public class SearchMain {
    public static void main(String[] args) {
        int[] arr = {8, 9, 12, 15, 17, 19, 20, 21, 28};
        int answer = LinearSearch.search(arr, 15);
        System.out.println("Index of searched element in array: " + answer);

        //Because of binary search valid for only sorted data sets
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int found = BinarySearch.search(arr, 15);
        System.out.println(found);
    }
}
