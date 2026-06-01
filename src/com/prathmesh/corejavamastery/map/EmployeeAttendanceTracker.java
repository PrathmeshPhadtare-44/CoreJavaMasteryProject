package com.prathmesh.corejavamastery.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*A company stores employee check-ins.
Input:
101,102,103,101,104,102,101
Tasks:
1.Count how many times each employee checked in.
2.Find the employee with the highest check-ins.
3.Display employees in insertion order.
4.Display employees sorted by employee ID.
* */
public class EmployeeAttendanceTracker {
    public static void main(String[] args) {
        String input="101,102,103,101,104,102,101";
        String[] employeeIds=input.split(",");
        LinkedHashMap<Integer,Integer> employeeCheckIns=new LinkedHashMap<>();
        for (String id: employeeIds){
            int empId = Integer.parseInt(id);
            if (employeeCheckIns.containsKey(empId)){
                employeeCheckIns.put(empId,employeeCheckIns.get(empId)+1);
            }
            else {
                employeeCheckIns.put(empId,1);
            }
        }

        System.out.println("Check-in Count:");
        System.out.println(employeeCheckIns);

        int maxCnt=0;
        int maxCntEmp=0;
        for (Map.Entry<Integer,Integer> map:employeeCheckIns.entrySet()){
            if (map.getValue() > maxCnt){
                maxCnt = map.getValue();
                maxCntEmp = map.getKey();
            }
        }
            System.out.println("Employee with highest Check-Ins : "+maxCntEmp+" with "+maxCnt+" cehck ins");

        System.out.println("Empyees in insertion order");
        System.out.println(employeeCheckIns.keySet());

        TreeMap<Integer,Integer> sortedemployeeCheckIns= new TreeMap<>(employeeCheckIns);
        System.out.println("Employee sorted by Id \n"+sortedemployeeCheckIns.keySet());
    }
}
