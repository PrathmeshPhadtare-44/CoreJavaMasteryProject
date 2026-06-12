package com.prathmesh.corejavamastery.streamapi;
import java.util.Arrays;
import java.util.List;

public class FilterPractice {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                10, 25, 30, 45, 50, 15, 60, 75, 80, 5
        );

        List<String> names = Arrays.asList(
                "Prathmesh", "Ram", "Shyam", "Amit",
                "Anjali", "Priya", "Rohit", "Sneha"
        );

        List<String> cities = Arrays.asList(
                "Nashik", "Pune", "Mumbai", "Delhi",
                "Nagpur", "Chennai", "Hyderabad", "Goa"
        );

        // Q1
        // Print all numbers greater than 40.
        System.out.println("Print all numbers greater than 40.");
                numbers.stream()
                        .filter(number -> number  > 40)
                        .forEach(System.out::println);

        // Q2
        // Print all even numbers.
        System.out.println("Printing all even numbers");
         numbers.stream()
                 .filter(number -> number % 2 == 0)
                 .forEach(System.out::println);

        // Q3
        // Print all odd numbers.
        System.out.println("Printing all odd numbers");
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);

        // Q4
        // Print all numbers less than 30.
        System.out.println("Print all numbers less than 30.");
          numbers.stream()
                  .filter(number -> number <30)
                  .forEach(System.out::println);

        // Q5
        // Print names starting with 'A'.
        System.out.println("Print names starting with 'A'.");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

        // Q6
        // Print names whose length is greater than 5.
        System.out.println("Print names whose length is greater than 5.");
        names.stream()
                .filter(name -> name.length() > 5)
                .forEach(System.out::println);

        // Q7
        // Print names ending with 'a'.
        System.out.println("Print names ending with 'a'.");
        names.stream()
                .filter(name  -> name.endsWith("a"))
                .forEach(System.out::println);

        // Q8
        // Print cities containing the letter 'a'.
        System.out.println("Print cities containing the letter 'a'.");
        cities.stream()
                .filter(name  -> name.contains("a"))
                .forEach(System.out::println);

        // Q9
        // Print cities whose length is greater than 6.
        System.out.println("Print cities whose length is greater than 6.");
            cities.stream()
                    .filter(city -> city.length() > 6)
                    .forEach(System.out::println);
        // Q10
        // Print cities starting with 'N' or 'P'.
        System.out.println("Print cities starting with 'N' or 'P'.");
        cities.stream()
                .filter(city -> city.startsWith("N") || city.startsWith("P"))
                .forEach(System.out::println);
    }
}