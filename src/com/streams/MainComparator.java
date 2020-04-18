package com.streams;

public class MainComparator {

    public static void main(String... args){

        //lambda expression
        //compare accoridng to age
        Comparator<Person> cmpAge = (p1,p2) -> p2.getAge() - p1.getAge();

        //compare according to first name
        Comparator<Person> cmpFirstName = (p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName());

        //compare last name
        Comparator<Person> cmpLastName = (p1,p2) -> p1.getLastName().compareTo(p2.getLastName());

    }
}
