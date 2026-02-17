package com.gla.Strings.level3;
import java.util.Scanner;
public class PalindromeCheck {
    //  Logic 1: Using Start and End Index (Iterative Method)
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    //  Logic 2: Using Recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {

        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    //  Method to Reverse String using charAt()
    public static char[] reverseString(String text) {

        char[] reverse = new char[text.length()];
        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index++] = text.charAt(i);
        }

        return reverse;
    }

    // Logic 3: Using Character Arrays
    public static boolean isPalindromeUsingArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    //  Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // Logic 1
        boolean result1 = isPalindromeIterative(input);

        // Logic 2
        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);

        // Logic 3
        boolean result3 = isPalindromeUsingArray(input);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Using Iterative Method: " + result1);
        System.out.println("Using Recursive Method: " + result2);
        System.out.println("Using Array Method: " + result3);

        sc.close();
    }
}
