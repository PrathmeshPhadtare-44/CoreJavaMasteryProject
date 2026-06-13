package com.prathmesh.corejavamastery.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstPractice {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                10, 25, 30, 45, 50, 60
        );

        List<String> names = Arrays.asList(
                "Ram", "Amit", "Anjali", "Priya"
        );

        // Easy
// Q1
// Find the first number greater than 30.
Optional<Integer> firstNumber = numbers.stream()
        .filter(number -> number > 30)
        .findFirst();
        System.out.println("First Number greater than 30 : "+ firstNumber.orElse(-1));
       // numberGreaterThen30.ifPresent(System.out::println);
// Intermediate
// Q2
// Find the first name starting with 'A'.

           Optional<String> firstName = names.stream()
                         .filter(name -> name.startsWith("A"))
                         .findFirst();
        System.out.println("First Name starts with the letter 'A' : "+firstName.orElse("Not Found"));
// Hard
// Q3
// Find the first name
// that starts with 'P'
// and has length greater than 5.
        Optional<String> matchingName =
                names.stream()
                .filter(name -> name.startsWith("P") &&
                name.length() > 5)
                .findFirst();
        System.out.println("First Name starts with the letter 'P' and length greater than 5 : "+matchingName.orElse("None"));

    }
}