package com.izzat.algos.sorting.bucketsort;

import java.util.ArrayList;
import java.util.List;

public class BucketSort {
    public static int[] bucketSort(int[] arr) {

        int numberOfBuckets = (int) Math.round(Math.sqrt(arr.length));
        List<Bucket> buckets = new ArrayList<>();
        for (int i = 0; i < numberOfBuckets; i++) {
            buckets.add(new Bucket());
        }

        int max = getMaxOfArray(arr);
        for (int value : arr) {
            int bucketNumber = (int) Math.ceil((float) value * numberOfBuckets / max);
            buckets.get(bucketNumber - 1).add(value);
        }

        buckets.forEach(Bucket::sortBuckets);

        ArrayList<Integer> helper = new ArrayList<>();
        buckets.forEach(x -> helper.addAll(x.getList()));

        for (int i = 0; i < helper.size(); i++) {
            arr[i] = helper.get(i);
        }
        return arr;
    }

    private static int getMaxOfArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int nums : arr) {
            if (max < nums) max = nums;
        }
        return max;
    }
}
