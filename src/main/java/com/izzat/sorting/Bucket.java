package com.izzat.sorting;

import java.util.ArrayList;
import java.util.Comparator;

public class Bucket {

    private final ArrayList<Integer> list = new ArrayList<>();

    public void add(int number) {
        list.add(number);
    }

    public void sortBuckets() {
        list.sort(Comparator.naturalOrder());
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Bucket{list=%s}".formatted(list);
    }
}
