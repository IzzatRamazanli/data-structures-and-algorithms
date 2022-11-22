package com.izzat.bigO;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                index = i;
                break;
            }
        }//O(n)

        System.out.println("index: " + index);
    }
}
