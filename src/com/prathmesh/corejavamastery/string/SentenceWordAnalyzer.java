package com.prathmesh.corejavamastery.string;
/*
* Hard
Question 4
Given:
String text = "Java is powerful and Java is popular";
Without using collections:
Find:
Total words
Number of times "Java" appears
Longest word
Shortest word
Reverse every word individually
Expected style:
Total Words : 7
Java Count : 2
Longest Word : powerful
Shortest Word : is
Reversed Words :
avaJ si lufrewop dna avaJ si ralupop*/
public class SentenceWordAnalyzer {

    public static int getTotalWords(String sentence){
        String[] words = getWordsFormSentence(sentence);
        return words.length;
    }
    public static String getLongestWord(String sentence){
        String[] words =getWordsFormSentence(sentence);
        String longestWord=words[0];
        for (String word :  words){
            if (longestWord.length() < word.length())
            {
                longestWord = word;
            }
        }
        return longestWord;
    }
    public static String getShortestWord(String sentence){
        String[] words = getWordsFormSentence(sentence);
        String shortestWord=words[0];
        for (String word :  words){
            if (shortestWord.length() > word.length())
            {
                shortestWord = word;
            }
        }
        return shortestWord;
    }
    public static String[] getWordsFormSentence(String sentence){
        return sentence.trim().split(" ");
    }
    public static String getReversedWordWithSamePosition(String sentence){
        String[] words = getWordsFormSentence(sentence);
        String newReversedSentence="";
        for (String word : words){
            newReversedSentence += new StringBuilder(word).reverse().toString() + " ";
        }


        return newReversedSentence;
    }
    public static int getCountOfWordInSentence(String sentence, String targetWord){
        int count=0;
        String[] words = getWordsFormSentence(sentence);
        for (String word : words)
        {
            if (word.equals(targetWord)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    String sentence="Java is powerful and Java is popular";
//        Total Words : 7
        System.out.println("Total Words : "+getTotalWords(sentence));
//        Java Count : 2
        System.out.println("Java Count : "+getCountOfWordInSentence(sentence,"Java"));
//        Longest Word : powerful
        System.out.println("Longest Word : "+getLongestWord(sentence));
//        Shortest Word : is
        System.out.println("Shortest Word : "+getShortestWord(sentence));
//        Reversed Words :
        System.out.println(getReversedWordWithSamePosition(sentence));
//        avaJ si lufrewop dna avaJ si ralupop
    }
}
