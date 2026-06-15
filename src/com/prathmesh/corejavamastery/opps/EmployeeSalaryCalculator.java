package com.prathmesh.corejavamastery.opps;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Rahul",
                45000,
                4
        );
        System.out.println(employee);



    }
}
/*
* Average
## Question 2
### Employee Salary Calculator
**Input:*
```text
Employee Name: Rahul
Monthly Salary: 45000
Experience: 4 Years
```
**Tasks:**
* Create an Employee class.
* Create an Employee object.
* Calculate annual salary.
* Give 10% bonus if experience is more than 3 years.
* Display employee status.

**Expected Output Example:**
```text
Employee Details
----------------
Name : Rahul
Monthly Salary : 45000
Annual Salary : 540000
Bonus : 54000

Status : Experienced Employee*/
class Employee {

    private String name;
    private double monthlySalary;
    private int experience;


    @Override
    public String toString() {
        return """
        Employee Details
        ----------------
        Name            : %s
        Monthly Salary  : %.2f
        Annual Salary   : %.2f
        Bonus           : %.2f
        Status          : %s
        """.formatted(
                name,
                monthlySalary,
                calculateAnnualSalary(),
                calculateBonus(),
                getStatus()
        );
    }


    public Employee(String name, double monthlySalary, int experience) {
        if (monthlySalary < 0){
            throw  new IllegalArgumentException("Salary cannot be negative");
        }
        if (experience < 0){
            throw new IllegalArgumentException("Experience cannot be negative");
        }
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.experience = experience;
    }




    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    public double calculateBonus() {
        if(experience > 3){
            return calculateAnnualSalary() * 0.10;
        }
        return 0;
    }

    public String getStatus() {
        return experience > 3
                ? "Experienced Employee"
                : "Regular Employee";
    }
}