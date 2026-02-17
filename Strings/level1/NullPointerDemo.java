package com.gla.Strings.level1;
import java.util.Scanner;
public class NullPointerDemo {
    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;

        // This line will generate NullPointerException
        System.out.println("Length of string: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;

        try {
            System.out.println("Length of string: " + text.length());
        }
        catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("Cannot call methods on a null reference.");
        }
    }

    public static void main(String[] args) {

        System.out.println("Calling method to generate exception:");

        try {
            generateException();
        }
        catch (Exception e) {
            System.out.println("Exception handled in main: " + e);
        }

        System.out.println("\nCalling method to handle exception internally:");
        handleException();
    }
}
