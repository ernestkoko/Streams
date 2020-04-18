package com.streams;

import java.util.function.Function;

//Functional interface only takes in one abstract method
@FunctionalInterface
public interface Comparator<T> {
    public int compare(T t1, T t2);

    //writing my own comparing method
    public static Comparator<Person> comparing(Function<Person, Integer> f){

        return (p1,p2) -> f.apply(p1) - f.apply(p2);
    }
    public static Comparator<Person> comparing1(Function<Person, String> f){

        return (p1,p2) ->f.apply(p1).compareTo(f.apply(p2));

    }
}
