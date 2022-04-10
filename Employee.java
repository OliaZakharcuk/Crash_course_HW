package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements CalculatePay, Comparable<Employee>{
    private String employeeId;
    private Integer averageMonthlySalary;
    public static ArrayList<Employee> emp = new ArrayList<Employee>();
    public Employee(String employeeId) {
        this.employeeId = employeeId;
        emp.add(this);
        //Collections.sort(emp);


    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    public void setAverageMonthlySalary(Integer averageMonthlySalary) {
        this.averageMonthlySalary = averageMonthlySalary;
    }

    @Override
    public void calculatePay() {

    }


    @Override
    public int compareTo(Employee o) {
        if (this.averageMonthlySalary > o.averageMonthlySalary) {

            // if current object is greater,then return 1
            return 1;
        }
        else if (this.averageMonthlySalary < o.averageMonthlySalary) {

            // if current object is greater,then return -1
            return -1;
        }
        else {

            // if current object is equal to o,then return 0
            return 0;
        }
    }
}
