package com.izzat.searching;

public class SearchMain {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8, 7, 9};
        int answer = LinearSearch.search(arr, 2);
        System.out.println("Index of searched element in array: " + answer);
    }
}
