package com.company;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new SalariedEmployee("waiter", "Oleh", "AA55", 30);
        Employee emp2 = new SalariedEmployee("dog walker", "Bogdan", "AA56", 20);
        Employee emp3 = new ContractEmployee("dev", "Stepan", true, 50000);
        Employee emp4 = new ContractEmployee("dev", "Petro", true, 70000);
        System.out.println("Unsorted list: ");
        for (Employee i: Employee.emp) {
            i.calculatePay();
            System.out.println(i.toString());
        }
        Collections.sort(Employee.emp);
        System.out.println("Sorted list: ");
        for (Employee i: Employee.emp) {

            System.out.println(i.toString());
        }

    }
}
