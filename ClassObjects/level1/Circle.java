package com.gla.ClassObjects.level1;

class Circle {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display results
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + calculateArea());
        System.out.println("Circumference of Circle: " + calculateCircumference());
    }
}

class Main1 {
    public static void main(String[] args) {
        // Creating Circle object
        Circle c1 = new Circle(5);

        // Displaying area and circumference
        c1.displayDetails();
    }
}
