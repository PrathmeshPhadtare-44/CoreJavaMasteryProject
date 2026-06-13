package com.prathmesh.corejavamastery.streamapi;

import java.util.Arrays;
import java.util.List;

public class MatchPractice {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                10, 20, 30, 40, 50
        );

        List<String> names = Arrays.asList(
                "Ram", "Amit", "Priya", "Shyam"
        );

        // Easy
// Q1
// Check if any number is greater than 45.
boolean anyMatchedCondition =
        numbers.stream()
                .anyMatch(n -> n > 45);
        System.out.println("Is there any number greater than 45? " + anyMatchedCondition);
// Intermediate
// Q2
// Check if all names
// have length greater than 2.
boolean allNamesLengthGreaterThan2 =
        names.stream()
                .allMatch(name -> name . length() > 2);
        System.out.println("Do all names have a length greater than 2? " + allNamesLengthGreaterThan2);

// Hard
// Q3
// Check if no name starts with 'Z'
// and every name has length greater than 2.
        boolean noNameStartWithZ =
        names.stream()
                .noneMatch(name -> name.startsWith("Z"));
         allNamesLengthGreaterThan2 =
                names.stream()
                        .allMatch(name -> name.length() > 2);
         boolean result = noNameStartWithZ && allNamesLengthGreaterThan2;
        System.out.println(
                "Do no names start with 'Z' and do all names have a length greater than 2? "
                        + result
        );    }
}