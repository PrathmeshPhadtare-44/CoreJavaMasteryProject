package com.prathmesh.corejavamastery.string;
//Easy
//Question 1
//String text = "Programming";
//Print:
//Length
//First character
//Last character
//Uppercase version
//Lowercase version
//Whether it contains "gram"
//Expected Output Example
//Length : 11
//First Character : P
//Last Character : g
//Uppercase : PROGRAMMING
//Lowercase : programming
//Contains gram : true
public class StringBasicOperations {
    public static void main(String[] args) {
        String text = "Programming";
        //Length
        System.out.println("Length : "+text.length());
        //First character
        System.out.println("First Character :"+text.charAt(0));
        // Last character
        System.out.println("First Character :"+text.charAt(text.length() - 1));

        //Uppercase version
        System.out.println("UpperCase :"+text.toUpperCase());
        //Lowercase version
        System.out.println("LowerCase :"+text.toLowerCase());

        //Whether it contains "gram"
        System.out.println(text+" Contains \"gram\" :"+(text.contains("gram")?"Yes":"No"));
    }
}
