package com.gla.Strings.level1;
import java.util.Scanner;
public class CompareStrings {
    public static boolean compareUsingCharAt(String str1, String str2) {

        // If lengths are different, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare character by character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true; // If all characters match
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Comparing using charAt() method
        boolean result1 = compareUsingCharAt(str1, str2);

        // Comparing using built-in equals() method
        boolean result2 = str1.equals(str2);

        // Display results
        System.out.println("Result using charAt(): " + result1);
        System.out.println("Result using equals(): " + result2);

        // Checking if both results are same
        if (result1 == result2) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Both methods give different results.");
        }

        sc.close();
    }
}

