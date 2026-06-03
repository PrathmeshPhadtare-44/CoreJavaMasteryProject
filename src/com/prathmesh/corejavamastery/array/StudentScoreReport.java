package com.prathmesh.corejavamastery.array;
/*
* Student Score Report
Input
Hardcode:
78,45,89,56,92,33,67,81,49,95
Store in an array.
Tasks
Find topper score. getTopScore
Find lowest score. getLowestScore
Calculate average score. getAverageScore
Count students who passed (>=40).cuntStudentWhoPassedAbove(array , target score)
Count students scoring above average. getStudentScoreAbove(array, taeget score )
Display all failed students (<40). getStudentScoredBelow(array  , target score)
* */
public class StudentScoreReport {
 public static int getTopScore(int[] studentScores) {
     int topScore = studentScores[0];
     for (int score : studentScores){
         if (topScore <  score){
             topScore = score;
         }
     }
     return topScore;
 }
    public static int getLowestScore(int[] studentScores) {
        int lowetsScore = studentScores[0];
        for (int score : studentScores){
            if (lowetsScore >  score){
                lowetsScore = score;
            }
        }
        return lowetsScore;
    }
 public static int getAverageScore(int[] studentScore){
     int totalOfScores=0 , totalNumberOfScores=0;
     for (int score : studentScore){
         totalOfScores += score;
         totalNumberOfScores++;
     }
     return  totalOfScores / totalNumberOfScores;
 }
public static  int cuntStudentWhoPassedAbove(int[] studentSocres , int target){
    int count = 0;
    for (int score : studentSocres){
        if (score >= target){
            count++;
        }
    }
return  count;
}
    public static  int cuntOfStudentScoringAboveAverage(int[] studentSocres , int average){
        int count = 0;
        for (int score : studentSocres){
            if (score > average){
                count++;
            }
        }
        return  count;
    }
    public static void failedStudents(int[] studentScores ,  int passingMarks){
        System.out.println("failed student marks are :");
     for (int score : studentScores){
         if (score < passingMarks){
             System.out.print(score+"");
         }
     }
    }
    public static void main(String[] args) {
        int[] studentScore= {78,45,89,56,92,33,67,81,49,95};
//        Find topper score.
        System.out.println("Top student score is :"+getTopScore(studentScore));
//        Find lowest score.
        System.out.println("Lowest student score is :"+getLowestScore(studentScore));
//        Calculate average score.
        System.out.println("Average score is :"+getAverageScore(studentScore));
//        Count students who passed (>=40).
        System.out.println("The count of student scored above and equal to 40 are:"+cuntStudentWhoPassedAbove(studentScore , 40));
//        Count students scoring above average.
        System.out.println("The count of student scored above average is:"+cuntOfStudentScoringAboveAverage(studentScore,getAverageScore(studentScore)));
//                Display all failed students (<40).
//        System.out.println("failed student mark is ");
        failedStudents(studentScore,40);
 }
}
