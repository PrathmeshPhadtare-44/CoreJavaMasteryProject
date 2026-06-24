package com.prathmesh.corejavamastery.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*Question 2 (Intermediate)
Word Counter From File
Input File

article.txt

Java is powerful.
Java is object oriented.
Spring Boot uses Java.

Task

Read the file and calculate:

Total lines
Total words
Total characters (excluding spaces)
Expected Output
Lines = 3
Words = 10
Characters = 47*/
public class WordCounterFromFile {
    public static int getCharetorCountFromLine(String line){
        if (line.isEmpty()){return 0;}
        line = line.replaceAll("[^a-zA-Z0-9 ]", "");
           String[] words = getwordsFromLine(line);
            int count = 0 ;
            for (String word :  words){
//                if (word.contains(".")){
//                    count --;
//                }
                count += word.length();
            }
    return  count;
    }
    public static String[] getwordsFromLine(String line){
      return (line.trim()).split("\\s+");

    }
    public static int getWordCountFromLine(String line){
        if (line.isEmpty()){return 0;}
     return    getwordsFromLine(line).length;
    }
    public static void main(String[] args) {
int lineCounter = 0;
int wordCounter = 0;
int charCounter = 0;

   try (BufferedReader bufferedReader =
           new BufferedReader(new FileReader("article.txt"))){
        String line;
        while ((line = bufferedReader.readLine()) != null){
            lineCounter ++ ;
            wordCounter += getWordCountFromLine(line);
            charCounter += getCharetorCountFromLine(line);
        }
   }
   catch (IOException e ){
       System.out.println(e.getMessage());
   }
        System.out.println("Lines : "+lineCounter+
                            "\n Words : " + wordCounter +
                            "\n Character : " + charCounter);
    }

}
