package com.gla.ClassObjects.level2;

public class CarItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CarItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add items
    void addItem(int qty) {
        if (qty > 0) {
            quantity += qty;
            System.out.println(qty + " item(s) added to cart.");
        } else {
            System.out.println("Invalid quantity!");
        }
    }

    // Method to remove items
    void removeItem(int qty) {
        if (qty > 0 && qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " item(s) removed from cart.");
        } else {
            System.out.println("Invalid quantity or not enough items in cart!");
        }
    }

    // Method to display total cost
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }
}

class Main2 {
    public static void main(String[] args) {

        // Creating cart item
        CarItem item1 = new CarItem("Headphones", 1500, 2);

        // Performing operations
        item1.addItem(1);
        item1.removeItem(1);
        item1.displayTotalCost();
    }
}
