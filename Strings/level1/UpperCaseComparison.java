package com.gla.Strings.level1;
import java.util.Scanner;
public class UpperCaseComparison {

    // Method to convert text to uppercase using charAt() and ASCII logic
    public static String convertToUpper(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // If character is lowercase (a to z)
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);  // ASCII difference between lowercase and uppercase
            }

            result = result + ch;
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking complete line input
        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        // Convert using user-defined method
        String userUpper = convertToUpper(text);

        // Convert using built-in method
        String builtInUpper = text.toUpperCase();

        // Compare both results
        boolean result = compareStrings(userUpper, builtInUpper);

        // Display results
        System.out.println("Uppercase using user-defined method: " + userUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);
        System.out.println("Are both results equal? " + result);

        sc.close();
    }
}
