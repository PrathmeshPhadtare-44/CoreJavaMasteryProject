package com.prathmesh.corejavamastery.codingpractice;

import java.util.Scanner;

// P1. Write a program to check if a number is palindrome
public class Question1 {
    public static boolean isPalindrome(String value){
        String reverseValue ="";
        for (char i : value.toCharArray()){
            reverseValue = String.valueOf(i) + reverseValue;
        }

 return  reverseValue.equals(value);
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a string or number to check whether it is a palindrome:");        String value = sc.nextLine();
        System.out.println(isPalindrome(value));
    }

}
