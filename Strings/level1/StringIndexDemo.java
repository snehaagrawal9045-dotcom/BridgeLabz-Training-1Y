package com.gla.Strings.level1;
import java.util.Scanner;
public class StringIndexDemo {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing invalid index (greater than length)
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("Index is out of range of the string length.");
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
