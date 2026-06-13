package com.prathmesh.corejavamastery.streamapi;

import java.util.Arrays;
import java.util.List;

public class LimitSkipPractice {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                40 , 30 , 20 , 10 ,80 , 70 , 60 , 50
        );

        // Easy
// Q1
// Print only the first 3 numbers.
        System.out.println("First 3 Numbers : ");
numbers.stream()
        .limit(3)
        .forEach(System.out::println);

// Intermediate
// Q2
// Skip the first 4 numbers
// and print the remaining numbers.
        System.out.println("Remaining numbers after skipping 4 : ");
numbers.stream()
        .skip(4)
        .forEach(System.out::println);

// Hard
// Q3
// Sort numbers.
// Skip the first 2 numbers.
// Print the next 3 numbers.
        System.out.println("Sorted skipping 2 numbers and printing next 3 : ");
        numbers.stream()
                .sorted()
                .skip(2)
                .limit(3)
                .forEach(System.out::println);
    }
}