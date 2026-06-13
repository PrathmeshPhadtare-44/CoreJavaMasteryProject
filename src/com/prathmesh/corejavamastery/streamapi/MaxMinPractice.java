package com.prathmesh.corejavamastery.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxMinPractice {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                10, 80, 20, 40, 100, 30
        );
        List<String> names = Arrays.asList(
                "Ram", "Amit", "Priya", "Shyam" , "Prathemsh"
        );

        // Easy
// Q1
// Find the maximum number.

       Optional<Integer> maxNumber = numbers.stream()
                .max(Integer::compareTo);
        System.out.println("Maximum number is : "+maxNumber.orElse(-1));


// Intermediate
// Q2
// Find the minimum number.
        Optional<Integer> minNumber = numbers.stream()
                .min(Integer::compareTo);
        System.out.println("Minimum number is : "+minNumber.orElse(-1));


// Hard
// Q3
// Find the longest name.
// If multiple names have same length,
// print the first one found.
  Optional<String> longestFirstWord =  names.stream()
        .max(Comparator.comparingInt(String::length));
                //.max((s1 , s2) -> s1.length() - s2.length());
        System.out.println("Longest first word : " + longestFirstWord.orElse("Not found"));
    }
}