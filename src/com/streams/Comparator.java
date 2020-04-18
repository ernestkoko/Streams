package com.streams;

import java.util.function.Function;

//Functional interface only takes in one abstract method
@FunctionalInterface
public interface Comparator<T> {

    //this is the abstract method
    public int compare(T t1, T t2);

    public default Comparator<T> thenComparing(Comparator<T> cmp){

        return (p1,p2) -> compare(p1,p2) == 0 ? cmp.compare(p1,p2): compare(p1,p2);
    }

    public default Comparator<T> thenComparing(Function<T, Comparable> f){
       // Comparator<T> cmp = comparing(f);

        return thenComparing(comparing(f));
    }

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
