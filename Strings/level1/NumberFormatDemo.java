package com.gla.Strings.level1;
import java.util.Scanner;
public class NumberFormatDemo {
    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // This will throw exception if text is not a valid number
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e);
            System.out.println("Input is not a valid integer.");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
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
