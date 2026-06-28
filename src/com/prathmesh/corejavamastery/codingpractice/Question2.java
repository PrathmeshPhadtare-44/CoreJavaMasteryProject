package com.prathmesh.corejavamastery.codingpractice;

import java.util.Scanner;

//P2. Write a program to reverse a string without using built-in reverse()
public class Question2 {
    public static String reverseString(String value){
        String reversedValue = "";
        for (char ch : value.toCharArray()){
            reversedValue = ch +reversedValue;
        }
    return  reversedValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type value to see it reverse value :");
        String value = sc.nextLine();
        System.out.println(reverseString(value));
    }
}
