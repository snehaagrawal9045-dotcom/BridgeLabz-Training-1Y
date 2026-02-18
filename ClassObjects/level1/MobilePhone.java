package com.gla.ClassObjects.level1;

public class MobilePhone {
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

class Main3 {
    public static void main(String[] args) {

        // Creating MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 75000);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 15", 80000);

        // Displaying details
        System.out.println("Phone 1 Details:");
        phone1.displayDetails();

        System.out.println("\nPhone 2 Details:");
        phone2.displayDetails();
    }
}
