package com.prathmesh.corejavamastery.streamapi;

import java.util.Arrays;
import java.util.List;

public class MapPractice {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                10, 20, 30, 40, 50
        );

        List<String> names = Arrays.asList(
                "Prathmesh", "Ram", "Shyam", "Amit", "Priya"
        );

        // Easy
// Q1
// Double every number and print the result.
        System.out.println("Double every number and print the result.");
        numbers.stream()
                .map(number -> number * 2)
                .forEach(System.out::println);


// Intermediate
// Q2
// Convert all names to uppercase and print them.
        System.out.println(" Convert all names to uppercase and print them.");
        names.stream()
                .map(String::toUpperCase)
                //.map(name -> name.toUpperCase())
                .forEach(System.out::println);

// Hard
// Q3
// Convert each name into:
// "Name : <name> Length : <length>"
// and print the result.
        System.out.println("""
                Convert each name into:
                 "Name : <name> Length : <length>"
                 and print the result.""");
        names.stream()
                .map(name -> "Name : "+name+"Length : "+name.length())
                .forEach(System.out::println);

    }
}