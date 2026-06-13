package com.prathmesh.corejavamastery.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducePractice {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                10, 20, 30, 40, 50
        );
        List<String> names = Arrays.asList(
                "Ram", "Amit", "Priya", "Shyam" , "Prathemsh"
        );
        // Easy
// Q1
// Find the sum of all numbers.
int sum = numbers.stream()
        //.reduce(0 ,(n1, n2) ->  n1 + n2);
        .reduce(0,Integer::sum);
        System.out.println("Sum of all Numbers is : " + sum);
// Intermediate
// Q2
// Find the product of all numbers.
int product = numbers.stream()
        .reduce(1 ,(n1 , n2) -> n1 * n2);
        System.out.println("Product of all number is : " + product);

// Hard
// Q3
// Join all names into a single string
// separated by commas.
//
// Example:
// Ram,Amit,Priya,Shyam
Optional<String> listOfNames = names.stream()
        .reduce( (s1,s2) -> s1 + "," + s2);

        System.out.println("List of name separated by commas : " + listOfNames.orElse(""));

    }
}