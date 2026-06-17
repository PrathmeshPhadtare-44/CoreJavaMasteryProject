package com.prathmesh.corejavamastery.opps;
/*
*
# Hard

## Question 4

### Online Course Dashboard

**Input:**

```text
Course Name        Enrollments    Fee
Java               120            3000
Spring Boot         85            5000
MySQL               60            2500
Microservices       40            7000
System Design       95            6000
```

**Tasks:**

* Create a Course class.
* Create multiple Course objects.
* Calculate revenue for each course.
* Calculate total platform revenue.
* Find most popular course.
* Find least popular course.
* Calculate average enrollment.
* Display courses above average enrollment.
* Display premium courses (fee > 5000).
* Count courses generating revenue above ₹300000.
* Generate a final report.

**Expected Output Example:**

```text
Course Report
-------------

Java Revenue : 360000
Spring Boot Revenue : 425000
MySQL Revenue : 150000
Microservices Revenue : 280000
System Design Revenue : 570000

Total Revenue : 1785000

Most Popular Course : Java

Least Popular Course : Microservices

Average Enrollment : 80

Courses Above Average
---------------------
Java
Spring Boot
System Design

Premium Courses
---------------
Microservices
System Design

Courses Generating Revenue Above ₹300000
----------------------------------------
Java
Spring Boot
System Design

Count : 3*/

import java.util.ArrayList;
import java.util.List;

public class OnlineCourseDashboard {
    public static <T> void checkListNotEmpty(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException("List cannot be empty.");
        }
    }
    public static int getTotalPlatformRevenue(List<Course> courses){
    OnlineCourseDashboard.checkListNotEmpty(courses);
        int totalPlatformRevenue = 0;
            for (Course course : courses){
                totalPlatformRevenue += course.getRevenue();
            }

        return  totalPlatformRevenue;
    }
   public static String getMostPopularCourse(List<Course> courses){
       OnlineCourseDashboard.checkListNotEmpty(courses);
       String mostPopularCourseName = courses.get(0).getCourseName();
        int mostEnrollments = courses.get(0).getEnrollments();
        for (Course course : courses){
            if (mostEnrollments < course.getEnrollments()){
                mostEnrollments = course.getEnrollments();
                mostPopularCourseName = course.getCourseName();
            }
        }
        return mostPopularCourseName;
   }
    public static String getTheLeastPopularCourse(List<Course> courses){
        OnlineCourseDashboard.checkListNotEmpty(courses);
        String theLeastPopularCourseName = courses.get(0).getCourseName();
        int theLeastEnrollments = courses.get(0).getEnrollments();
        for (Course course : courses){
            if (theLeastEnrollments > course.getEnrollments()){
                theLeastEnrollments = course.getEnrollments();

                theLeastPopularCourseName = course.getCourseName();
            }
        }
        return theLeastPopularCourseName;
    }
    public static int getAverageEnrollment(List<Course> courses){
        OnlineCourseDashboard.checkListNotEmpty(courses);
        int totalEnrollments = courses.get(0).getEnrollments();
        int count = 1;
        for (Course course : courses){
            if (courses.get(0) == course){continue;}
            totalEnrollments += course.getEnrollments();
            count ++;
        }
        return totalEnrollments / count;
    }
    public static void displayCourseNameAboveAverageEnrollment(List<Course> courses ){
        OnlineCourseDashboard.checkListNotEmpty(courses);
        int averageOfEnrollment = OnlineCourseDashboard.getAverageEnrollment(courses);
        System.out.println("\nCourses Above Average\n" +
                "---------------------");
        for (Course course : courses){
            if (course.getEnrollments() > averageOfEnrollment){
                System.out.println(course.getCourseName());
            }
        }

    }
    public static void  displayPremiumCourses(List<Course> courses , int minimumFee){
        OnlineCourseDashboard.checkListNotEmpty(courses);
        System.out.println("\nPremium Courses\n" +
                "---------------");
        for (Course course : courses){
            if (course.getFee() > minimumFee){
                System.out.println(course.getCourseName());
            }
        }
    }
    public static void displayRevenueAboveThresholdRevenue(List<Course> courses , int thresholdRevenue){
        OnlineCourseDashboard.checkListNotEmpty(courses);
        int count = 0;
        System.out.println("\nCourses Generating Revenue Above "+thresholdRevenue+"\n" +
                "----------------------------------------");
        for (Course course : courses){
            if (course.getRevenue() > thresholdRevenue){
                System.out.println(course.getCourseName());
                count ++;
            }
        }
        if (count == 0 ){
            System.out.println("None of courses generate Revenue above "+thresholdRevenue+".");
        }
        else {
            System.out.println("Count : "+count);
        }
    }

    public static void main(String[] args) {
    List<Course> courses = new ArrayList<>();
        courses.add(new Course(        "Java"       ,        120        ,    3000));
        courses.add(new Course(        "Spring Boot"       ,        85        ,    5000));
        courses.add(new Course(        "MySQL"       ,        60        ,    2500));
        courses.add(new Course(        "Microservices"       ,        40        ,    7000));
        courses.add(new Course(        "System Design"       ,        95        ,    6000));
        System.out.println("Course Report\n" +
                "-------------");
        for (Course course : courses){
            System.out.println(course.getCourseName()+" Revenue : "+ course.getRevenue());
        }
        System.out.println("\nTotal Revenue : "+OnlineCourseDashboard.getTotalPlatformRevenue(courses));
//        Total Revenue : 1785000
        System.out.println("\nMost Popular Course : "+OnlineCourseDashboard.getMostPopularCourse(courses));
//        Most Popular Course : Java
        System.out.println("\nThe Least Popular Course : "+OnlineCourseDashboard.getTheLeastPopularCourse(courses));
//        Least Popular Course : Microservices
        System.out.println("\nAverage Enrollment : "+OnlineCourseDashboard.getAverageEnrollment(courses));
//        Average Enrollment : 80
        OnlineCourseDashboard.displayCourseNameAboveAverageEnrollment(courses);
        OnlineCourseDashboard.displayPremiumCourses(courses , 5000);
        //        Premium Courses
//        ---------------
//                Microservices
//        System Design
        OnlineCourseDashboard.displayRevenueAboveThresholdRevenue(courses , 300000);
//        Courses Generating Revenue Above ₹300000
//                ----------------------------------------
//        Java
//        Spring Boot
//        System Design
//
//        Count : 3
    }
}

class Course{
    private String courseName;
    private int enrollments;
    private double fee;
    Course(String courseName , int enrollments , double fee ){
        if (courseName == null || courseName.isEmpty()){
            throw new IllegalArgumentException("Course name can not be empty.");
        }
        if (enrollments < 0){
            throw new IllegalArgumentException("Enrollments cannot be negative.");

        }
        if (fee < 0){
            throw new IllegalArgumentException("Fee cannot be negative.");

        }
        this.courseName = courseName;
        this.enrollments = enrollments;
        this.fee = fee;

    }

    public double getFee() {
        return fee;
    }

    public int getEnrollments() {
        return enrollments;
    }

    public String getCourseName() {
        return courseName;
    }
    public int getRevenue(){
        return  ((int) (enrollments * fee));
    }

}
