package com.gla.Strings.level1;
import java.util.Scanner;
public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // start index is greater than end index
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            // start index is greater than end index
            System.out.println("Substring: " + text.substring(5, 2));
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e);
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\nCalling method to generate exception:");
        try {
            generateException(text);
        }
        catch (Exception e) {
            System.out.println("Exception handled in main: " + e);
        }

        System.out.println("\nCalling method to handle exception internally:");
        handleException(text);

        sc.close();
    }
}
