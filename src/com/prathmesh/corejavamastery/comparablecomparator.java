package com.prathmesh.corejavamastery;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student implements Comparable<Student> {

    private  int id;
    private int age;
    private String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        return this.id - that.id;
    }
}

public class comparablecomparator {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(103, 22, "Prathmesh"));
        students.add(new Student(101, 20, "Ram"));
        students.add(new Student(105, 21, "Shyam"));
        students.add(new Student(102, 19, "Amit"));
        students.add(new Student(104, 23, "Priya"));

        // ==========================
        // Question 1 (Comparable)
        // ==========================
        //
        // Make Student implement Comparable<Student>.
        //
        // Define the natural/default sorting order
        // using student id.
        //
        // Then use:
        //
        // Collections.sort(students);
        //
        // Print all students after sorting.
        //
        // Expected Order:
        //
        // 101
        // 102
        // 103
        // 104
        // 105
        //
        // Do not use Comparator here.
        // Use compareTo() only.
        //
        System.out.println(students.toString());
        Collections.sort(students);
        System.out.println(students.toString());

        // ==========================
        // Question 2 (Comparator)
        // ==========================
        //
        // Create a Comparator<Student>.
        //
        // Sort students by age.
        //
        // Use:
        //
        // Collections.sort(students, comparator);
        //
        // Print all students after sorting.
        //
        // Expected Order:
        //
        // 19
        // 20
        // 21
        // 22
        // 23
        //
        // Do not change compareTo().
        //
        // Use compare() only.
        //
        Comparator<Student> comparator= (s1,s2) -> s1.getAge() - s2.getAge();
        //Collections.sort(students,comparator);
        students.sort(comparator);
        System.out.println(students.toString());
    }
}

