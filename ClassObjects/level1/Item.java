package com.gla.ClassObjects.level1;

class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Method to display item details
    void displayDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost(quantity));
    }
}

class Main2{
    public static void main(String[] args) {
        // Creating Item object
        Item item1 = new Item(101, "Notebook", 50.0);

        // Given quantity
        int quantity = 5;

        // Display details and total cost
        item1.displayDetails(quantity);
    }
}
