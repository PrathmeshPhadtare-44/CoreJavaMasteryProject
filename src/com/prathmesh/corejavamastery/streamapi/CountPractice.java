package com.prathmesh.corejavamastery.streamapi;

import java.util.Arrays;
import java.util.List;

public class CountPractice {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                10, 25, 30, 45, 50, 15, 60
        );

        List<String> names = Arrays.asList(
                "Ram", "Shyam", "Amit",
                "Prathmesh", "Priya"
        );

        // Easy
// Q1
// Count how many numbers are greater than 30.

        long count = numbers.stream()
                .filter(number -> number > 30)
                .count();
        System.out.println("Count of number greater than 30 : "+count);
// Intermediate
// Q2
// Count how many names
// have length greater than 5.
 count = names.stream()
        .filter(name -> name.length() > 5)
        .count();
        System.out.println("Counting name have length having more then 5 : "+count);

// Hard
// Q3
// Count names that start with 'P'
// and have length greater than 4.
        //.toLowerCase()
count = names.stream()
        .filter(name -> name.startsWith("P") && name.length() > 4)
        .count();
        System.out.println("Count of name starts with the 'P' and have length greater then 4 : "+count);
    }
}