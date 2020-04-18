package com.streams;

import java.util.function.Function;

public class MainComparator {

    public static void main(String... args){

        //lambda expression
        //compare according to age
        Comparator<Person> cmpAge = (p1,p2) -> p2.getAge() - p1.getAge();

        //compare according to first name
        Comparator<Person> cmpFirstName = (p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName());

        //compare last name
        Comparator<Person> cmpLastName = (p1,p2) -> p1.getLastName().compareTo(p2.getLastName());

        //doing it the old way
        Function<Person, Integer> f1 = p1 -> p1.getAge();
        Function<Person, String> f2 = p -> p.getFirstName();
        Function<Person, String> f3 = p -> p.getLastName();

        //comparator
       // Comparator<Person> cmpPerson = Comparator.comparing(p -> p.getAge());
        Comparator<Person> cmpPersonAge = Comparator.comparing(Person::getAge);
        Comparator<Person> cmpPersonLastName = Comparator.comparing(Person::getLastName);

        Comparator<Person> cmp = Comparator.comparing(Person::getLastName)
                                        .thenComparing(Person::getFirstName)
                                        .thenComparing(Person::getAge);



    }
}
