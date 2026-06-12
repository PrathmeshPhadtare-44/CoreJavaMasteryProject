package com.prathmesh.corejavamastery.streamapi;

import java.util.Arrays;
import java.util.List;

public class DistinctPractice {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                10, 20, 20, 30, 30, 40, 50, 50
        );

        List<String> names = Arrays.asList(
                "Ram", "Ram", "Amit",
                "Amit", "Priya", "Shyam"
        );

        // Easy
// Q1
// Print unique numbers only.
        System.out.println("Printing Unique numbers :");
        numbers.stream()
                .distinct()
                .forEach(System.out::println);

// Intermediate
// Q2
// Print unique names only.
        System.out.println("Printing Unique names :");
        names.stream()
                .distinct()
                .forEach(System.out::println);

// Hard
// Q3
// Print unique numbers greater than 20.
        System.out.println("Printing Unique number which is greater then 20:");
    numbers.stream()
            .distinct()
            .filter(number -> number > 20)
            .forEach(System.out::println);
    }
}