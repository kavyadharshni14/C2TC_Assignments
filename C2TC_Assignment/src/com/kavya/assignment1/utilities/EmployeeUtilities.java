package com.kavya.assignment1.utilities;

import com.kavya.assignment1.employees.Employee;

/**
 * Utility class for performing operations on Employee objects.
 */
public class EmployeeUtilities {

    /**
     * Increase the salary of an employee by a given percentage.
     */
    public static void giveRaise(Employee employee, double percentage) {
        if (employee == null) {
            System.out.println("Employee not found.");
            return;
        }
        if (percentage <= 0) {
            System.out.println("Percentage must be greater than 0.");
            return;
        }

        double currentSalary = employee.getSalary();
        double newSalary = currentSalary + (currentSalary * percentage / 100);
        employee.setSalary(newSalary);
        System.out.println(employee.getName() + " got a raise! New Salary: " + newSalary);
    }

    /**
     * Print details of an employee (uses polymorphism).
     */
    public static void printEmployeeDetails(Employee employee) {
        if (employee != null) {
            employee.displayInfo();
        } else {
            System.out.println("Employee details not available.");
        }
    }
}
