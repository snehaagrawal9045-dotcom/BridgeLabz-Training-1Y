package com.gla.Strings.level1;
import java.util.Scanner;
public class CharArrayComparison {
    // Method to return characters without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        return arr;
    }

    // Method to compare two character arrays
    public static boolean compareArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined method
        char[] userArray = getCharacters(text);

        // Built-in method
        char[] builtInArray = text.toCharArray();

        // Compare both arrays
        boolean result = compareArrays(userArray, builtInArray);

        // Display arrays
        System.out.print("Characters using user-defined method: ");
        for (char c : userArray) {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.print("Characters using toCharArray(): ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println();
        System.out.println("Are both character arrays equal? " + result);

        sc.close();
    }

}
