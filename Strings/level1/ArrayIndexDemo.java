package com.gla.Strings.level1;
import java.util.Scanner;
public class ArrayIndexDemo {
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing index greater than array length
        System.out.println("Name at invalid index: " + names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            System.out.println("Name at invalid index: " + names[names.length]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
            System.out.println("Index is outside the array length.");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        System.out.println("\nCalling method to generate exception:");
        try {
            generateException(names);
        }
        catch (Exception e) {
            System.out.println("Exception handled in main: " + e);
        }

        System.out.println("\nCalling method to handle exception internally:");
        handleException(names);

        sc.close();
    }
}
