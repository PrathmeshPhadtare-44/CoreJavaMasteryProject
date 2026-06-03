package com.prathmesh.corejavamastery.array;

import java.util.Arrays;

/*
* Question 1 (Easy)
Employee Salary Analyzer
Input
Hardcode the following salaries:
45000
55000
35000
60000
70000
50000
40000
65000
Store them in an array.
Tasks
Find highest salary.
Find lowest salary.
Calculate average salary.
Count employees earning above 50000.
Display all salaries below average.
Display salaries in original order.*/
public class EmployeeSalaryAnalyzer {
//Highest salary
    public static int getHighestSalary(int[] salaries){
        int highestSalary = salaries[0];
        for (int salary : salaries ){
            if (highestSalary < salary){
                highestSalary = salary;
            }
        }
        return  highestSalary;
    }
    public  static int getLowestSalary(int[] salaries){
        int lowestSalary = salaries[0];
        for (int salary : salaries){
            if (lowestSalary > salary){
                lowestSalary = salary;
            }

        }
        return  lowestSalary;
    }
    public static int getAverageSalary(int[] salaries){
                int totalSumOfSalary = 0, totalNumberOfSalary = 0;
                for (int salary : salaries){
                    totalSumOfSalary += salary;
                    totalNumberOfSalary ++;
                }
        return totalSumOfSalary / totalNumberOfSalary;
    }
    public static int countEmployeesAboveSalary(int[] salaries, int targetSalary)    {
        int cnt = 0;
        for (int salary : salaries){
            if (salary > targetSalary){
                cnt++;
            }
        }


    return cnt;
    }
    public static int[] getSalariesBelow(int[] salaries, int targetSalary)    {
        int cnt = 0;
        for (int salary : salaries){
            if (salary < targetSalary){
                cnt++;
            }
        }

        int[] filteredSalaries = new int[cnt];
        int i = 0;
        for (int salary : salaries){
            if (salary < targetSalary){
                filteredSalaries[i] = salary;
                i++;
            }
        }
        return filteredSalaries;
    }
    public static void printSalaries(int[] salaries){
        for (int salary : salaries)
        {
            System.out.print(salary+" ");
        }
    }
    public static void printArray(int[] array){
        for (int element : array){
            System.out.print(element+" ");
        }
    }

    public static void main(String[] args) {
        int[] employeeSalaries = {45000, 55000, 35000, 60000, 70000, 50000, 40000, 65000};
        System.out.println("Highest Salary :" + getHighestSalary(employeeSalaries));
        System.out.println("Lowest Salary :" + getLowestSalary(employeeSalaries));
        int averageSalary = getAverageSalary(employeeSalaries);
        System.out.println("Average Salary is " + averageSalary);
        System.out.println("Displaying count of  employee earning above 50K :"+countEmployeesAboveSalary(employeeSalaries,50000));
        System.out.println("Displaying employee salary below average");
        printArray(getSalariesBelow(employeeSalaries,averageSalary));
        System.out.println("\nDisplaying salaries in original order:");
        printArray(employeeSalaries);

    }
}
