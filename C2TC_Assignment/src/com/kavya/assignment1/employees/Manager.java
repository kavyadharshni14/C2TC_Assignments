package com.kavya.assignment1.employees;

/**
 * Manager class, subclass of Employee.
 */
public class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
