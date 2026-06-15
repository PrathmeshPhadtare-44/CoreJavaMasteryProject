package com.prathmesh.corejavamastery.opps;
/*
 * Question:
 * Student Information
 *
 * Input:
 * Student Name: Prathmesh
 * Age: 22
 * Marks: 78
 *
 * Tasks:
 * 1. Create Student class.
 * 2. Create Student object.
 * 3. Store values.
 * 4. Display details.
 * 5. Display Pass/Fail.
 */

public class StudentInformation {
    public static void main(String[] args) {
        Student student =  new Student(
                "Prathmesh" ,
                21 ,
                75.32);
        System.out.println(student);
        if(student.isPass()){
            System.out.println("Student is Pass.");
        }
        else {
            System.out.println("Student is failed.");
        }
    }

}
class Student{
    private  String name;
    private  int age;
    private  double mark;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }




    public Student(String name , int age , double mark ){
        if (age < 0){
            throw new IllegalArgumentException("Age cannot be negative ");
        }
        if(mark < 0 || mark > 100){
            throw new IllegalArgumentException("Invalid marks");
        }
        this.name = name;
        this.age = age;
        this.mark = mark;
    }


    public boolean isPass(){
        return  mark >= 35;
    }
}