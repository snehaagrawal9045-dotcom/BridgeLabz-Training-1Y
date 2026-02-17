package com.gla.Strings.level1;
import java.util.Scanner;
public class LowerCaseComparison {

    // Method to convert text to lowercase using charAt() and ASCII logic
    public static String convertToLower(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // If character is uppercase (A to Z)
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);  // ASCII difference between uppercase and lowercase
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
        String userLower = convertToLower(text);

        // Convert using built-in method
        String builtInLower = text.toLowerCase();

        // Compare both results
        boolean result = compareStrings(userLower, builtInLower);

        // Display results
        System.out.println("Lowercase using user-defined method: " + userLower);
        System.out.println("Lowercase using toLowerCase(): " + builtInLower);
        System.out.println("Are both results equal? " + result);

        sc.close();
    }
}
