package com.prathmesh.corejavamastery.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Question 3 (Intermediate)
Student Marks Manager
Create a Student class:
rollNo
name
marks
//Store 10 students.
//Tasks:
Find topper.
Find average marks.
Display students above average.
Display students sorted by marks descending.*/
class Student{
    int rollNo;
    String name;
    double marks;
    Student(int rollNo , String name , double marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}
public class StudentMarksManager {
    public static void main(String[] args) {
        ArrayList<Student> studentList= new ArrayList<>();
        studentList.add(new Student(1,"A",55.55));
        studentList.add(new Student(2,"B",78.55));
        studentList.add(new Student(3,"C",98.55));
        studentList.add(new Student(4,"D",75.55));
        studentList.add(new Student(5,"E",16.55));
        studentList.add(new Student(6,"F",35.55));
        studentList.add(new Student(7,"G",58.55));
        studentList.add(new Student(8,"H",72.55));
        studentList.add(new Student(9,"I",91.55));
        studentList.add(new Student(10,"J",42.55));
        int rollNo=0;
        String name="";
        double mark=0;// We can use Studnet new object to store all deatails .
        for (Student obj : studentList){
            if (obj.marks >mark){
                rollNo=obj.rollNo;
                mark = obj.marks;;
                name = obj.name;
            }
        }
        System.out.println("Task 1: Topper is "+name+" rollNo:"+rollNo+" marks:"+mark);
        //Find average mark
        double sum=0;
        int cnt=0;
        for (Student obj: studentList){
            sum += obj.marks;

            cnt++;
        }
        double averageMark=(sum / cnt);// sum / studentList.size();
        System.out.println("Average marks:"+averageMark);
//        Display students above average.
        System.out.println("students above average:");
        for (Student obj : studentList){
                if (obj.marks > averageMark){
                    System.out.println("RollNo:"+obj.rollNo+" Naem:"+obj.name+" Marks:"+obj.marks);
                }
        }
//        Display students sorted by marks descending.
        Comparator<Student> comparatorStudnet= (s1, s2) -> Double.compare(s2.marks, s1.marks);
        Collections.sort(studentList , comparatorStudnet);
        for (Student obj : studentList) {
            System.out.println(
                    "RollNo:" + obj.rollNo +
                            " Name:" + obj.name +
                            " Marks:" + obj.marks);
        }
    }
}
/*AI code that tell about SOLID and DRY
package com.prathmesh.corejavamastery.collections;

import java.util.ArrayList;
import java.util.Collections;

class Student {

    int rollNo;
    String name;
    double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "RollNo: " + rollNo +
                ", Name: " + name +
                ", Marks: " + marks;
    }
}

class StudentService {

    public Student findTopper(ArrayList<Student> students) {

        Student topper = students.get(0);

        for (Student student : students) {

            if (student.marks > topper.marks) {
                topper = student;
            }
        }

        return topper;
    }

    public double calculateAverage(ArrayList<Student> students) {

        double sum = 0;

        for (Student student : students) {
            sum += student.marks;
        }

        return sum / students.size();
    }

    public void displayAboveAverage(
            ArrayList<Student> students,
            double average) {

        System.out.println("\nStudents Above Average:");

        for (Student student : students) {

            if (student.marks > average) {
                System.out.println(student);
            }
        }
    }

    public void sortByMarksDescending(
            ArrayList<Student> students) {

        Collections.sort(
                students,
                (s1, s2) ->
                        Double.compare(
                                s2.marks,
                                s1.marks));
    }

    public void displayAllStudents(
            ArrayList<Student> students) {

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

public class StudentMarksManager {

    public static void main(String[] args) {

        ArrayList<Student> studentList =
                new ArrayList<>();

        studentList.add(new Student(1, "A", 55.55));
        studentList.add(new Student(2, "B", 78.55));
        studentList.add(new Student(3, "C", 98.55));
        studentList.add(new Student(4, "D", 75.55));
        studentList.add(new Student(5, "E", 16.55));
        studentList.add(new Student(6, "F", 35.55));
        studentList.add(new Student(7, "G", 58.55));
        studentList.add(new Student(8, "H", 72.55));
        studentList.add(new Student(9, "I", 91.55));
        studentList.add(new Student(10, "J", 42.55));

        StudentService service =
                new StudentService();

        Student topper =
                service.findTopper(studentList);

        System.out.println("Topper:");
        System.out.println(topper);

        double average =
                service.calculateAverage(studentList);

        System.out.println("\nAverage Marks: "
                + average);

        service.displayAboveAverage(
                studentList,
                average);

        service.sortByMarksDescending(
                studentList);

        System.out.println(
                "\nStudents Sorted By Marks Descending:");

        service.displayAllStudents(
                studentList);
    }
}
* */