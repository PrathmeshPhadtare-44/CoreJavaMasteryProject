package com.prathmesh.corejavamastery.string;
/*
* Intermediate
Question 3

Given:

String text = "aPpLe";

Perform all:

Count uppercase letters
Count lowercase letters
Convert first character to uppercase
Convert remaining characters to lowercase
Print final corrected word

Output:

Uppercase Count : 2
Lowercase Count : 3
Corrected Word : Apple

Use:

loop
charAt()
Character class methods
* */
public class StringCaseCorrection {
public static int getLowerCaseCount(String word){
    int count=0;
    for (int i = 0; i < word.length(); i++) {
if (Character.isLowerCase(word.charAt(i))){
count++;
}
    }
return count;
}
    public static int getUpperCaseCount(String word){
        int count=0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static String getWordCapitalisation(String word){
    return  String.valueOf(word.charAt(0)).toUpperCase()+word.substring(1).toLowerCase();

    }

    public static void main(String[] args) {
    String text = "aPpLe";
        System.out.println("Count of Lower Case in "+text+" is "+getLowerCaseCount(text)+"" +
                "\nCount of Upper Case in "+text+" is "+getUpperCaseCount(text));
        System.out.println("Converting word "+text+" to Capitalisation "+getWordCapitalisation(text));
}

}

