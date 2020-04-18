package com.streams;

import java.util.function.Function;

//Functional interface only takes in one abstract method
@FunctionalInterface
public interface Comparator<T> {
    public int compare(T t1, T t2);

    //writing my own comparing method
    public static <U> Comparator<U> comparing(Function<U, Comparable> f){

        return (p1,p2) -> f.apply(p1).compareTo(f.apply(p2));
    }
//    public static Comparator<Person> comparing1(Function<Person, String> f){
//
//        return (p1,p2) ->f.apply(p1).compareTo(f.apply(p2));
//
//    }
}
