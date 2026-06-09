package com.prathmesh.corejavamastery.string;

import java.util.ArrayList;

/*
* Average
Question 2
String text = "Java Programming Language";
Without hardcoding answers:
Find and print:
Total length
Number of spaces
First word
Last word
Index of "Programming"
Replace "Language" with "Course"*/
public class StringWordAnalysis {
    public static void main(String[] args) {
        String text = "Java Programming Language";
//        Total length
        System.out.println("Total length :"+text.length());
//        Number of spaces
        int spaceCnt=0;
        for (char ch : text.toCharArray()){
                if (ch == ' '){
        spaceCnt++;

                }
        }
        System.out.println("Number of space in "+text+" is "+spaceCnt);
//        First word
        ArrayList<Character> firstWord = new ArrayList<>();
        for (char ch : text.toCharArray()){

            if(ch != ' '){
                firstWord.add(ch) ;
            }
            else {break;}
        }
        System.out.println("First word is "+firstWord.toString());
//        Last word
        ArrayList<Character> lastWord = new ArrayList<>();
        for (int i = text.length()-1; i >= 0 ; i--) {
            if (text.charAt(i) != ' '){
                lastWord.add(text.charAt(i));
            }
            else {
                break;
            }
        }
        System.out.println("last word is "+lastWord.toString());


//        Index of "Programming"
        int startingIndex = -1, endingIndex= 0;
        char[] wordForIndex =new char[ "Programming".length()];
        int indexOfWord = 0;
        for (int i = 0; i < text.length(); i++) {
            if (wordForIndex[indexOfWord] == text.charAt(i)){
                if (startingIndex == -1){
                    startingIndex = i;
                }
                else {
                    wordForIndex[indexOfWord] = text.charAt(i);
                }

            }
        }
//        Replace "Language" with "Course"
    }
}
