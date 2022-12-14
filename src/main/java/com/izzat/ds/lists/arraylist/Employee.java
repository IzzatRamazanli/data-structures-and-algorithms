package com.izzat.ds.lists.arraylist;

public record Employee(int id, String firstName, String lastName) {
    @Override
    public String toString() {
        return firstName + "{id=%d, firstName='%s', lastName='%s'}"
                .formatted(id, firstName, lastName);
    }
}
