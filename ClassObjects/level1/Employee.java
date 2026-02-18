package com.gla.ClassObjects.level1;

public class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

class Main {
    public static void main(String[] args) {
        // Creating Employee object
        Employee emp1 = new Employee("Sneha", 101, 50000);

        // Displaying details
        emp1.displayDetails();
    }
}
