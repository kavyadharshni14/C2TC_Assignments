package com.kavya.assignment1.employees;

/**
 * Base class representing an Employee.
 */
public class Employee {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Protected setter (accessible in same package & subclasses)
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee info (can be overridden)
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}
