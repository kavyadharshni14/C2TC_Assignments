package com.kavya.assignment1;

import com.kavya.assignment1.employees.Manager;
import com.kavya.assignment1.employees.Developer;
import com.kavya.assignment1.utilities.EmployeeUtilities;

/**
 * Main class to demonstrate the functionality of Employee, Manager, and Developer.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Manager m1 = new Manager("Abinaya", 101, 75000, "HR");
        Developer d1 = new Developer("Nithiya", 102, 65000, "Java");

        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(m1);
        System.out.println("Department: " + m1.getDepartment());

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(d1);
        System.out.println("Programming Language: " + d1.getProgrammingLanguage());

        // Give raise
        System.out.println("\nGiving raise...");
        EmployeeUtilities.giveRaise(m1, 10);   // 10% raise
        EmployeeUtilities.giveRaise(d1, 20);   // 20% raise

        System.out.println("\nAfter Raise:");
        EmployeeUtilities.printEmployeeDetails(m1);
        EmployeeUtilities.printEmployeeDetails(d1);
    }
}
