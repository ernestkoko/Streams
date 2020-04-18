package com.streams;

//Functional interface only takes in one abstract method
@FunctionalInterface
public interface Comparator<T> {
    public int compare(T t1, T t2);
}