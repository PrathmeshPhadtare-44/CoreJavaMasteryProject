package com.prathmesh.corejavamastery.string;


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
        StringBuilder firstWord = new StringBuilder();
        for (char ch : text.toCharArray()){

            if(ch != ' '){
                firstWord.append(ch) ;
            }
            else {break;}
        }
        System.out.println("First word is :"+firstWord);
//        Last word
        StringBuilder lastWord = new StringBuilder();
        for (int i = text.length()-1; i >= 0 ; i--) {
            if (text.charAt(i) != ' '){
                lastWord.append(text.charAt(i));
            }
            else {
                break;
            }
        }
        System.out.println("last word is :"+lastWord.reverse());


//        Index of "Programming"
        String targetWord = "Programming";

        int foundIndex = -1;
        for (int i = 0; i <= text.length() - targetWord.length(); i++) {
            int j;
            for (j = 0; j < targetWord.length(); j++) {

                if (text.charAt(i + j) != targetWord.charAt(j)) {
                    break;
                }

            }
            if (j == targetWord.length()) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Index of " + targetWord + " is " + foundIndex);
        } else {
            System.out.println(targetWord + " not found");
        }


//        Replace "Language" with "Course"
        System.out.println(" Replace \"Language\" with \"Course\""+text.replace("Language","Course"));
    }
}
