package com.prathmesh.corejavamastery.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedPractice {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                50, 10, 80, 30, 20, 70
        );

        List<String> names = Arrays.asList(
                "Prathmesh", "Ram", "Shyam", "Amit", "Priya"
        );
// Easy
// Q1
// Sort all numbers in ascending order and print them.
        System.out.println("Sort all numbers in ascending order and print them.");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);
// Intermediate
// Q2
// Sort all names alphabetically and print them.
        System.out.println("Sort all names alphabetically and print them.");
        names.stream()
                .sorted()
                .forEach(System.out::println);

// Hard
// Q3
// Sort names by length.
// If two names have the same length,
// sort them alphabetically.
        System.out.println("""
                Sort names by length.
                If two names have the same length,
                sort them alphabetically.""");
    names.stream()
            .sorted(Comparator.comparingInt(String::length)
                    .thenComparing(String::compareTo)
            ).forEach(System.out::println);
    }
}