package com.gla.ClassObjects.level2;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

 class Main4 {
    public static void main(String[] args) {

        // Creating BankAccount object
        BankAccount acc1 = new BankAccount("Sneha", 12345, 10000);

        // Performing operations
        acc1.displayBalance();
        acc1.deposit(2000);
        acc1.withdraw(5000);
        acc1.displayBalance();
    }
}
