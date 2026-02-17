package com.gla.Strings.level2;
import java.util.Scanner;
public class TrimUsingCharAt {
    // (a) Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Remove leading spaces
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        // Remove trailing spaces
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // (b) Method to create substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    // (c) Method to compare two strings using charAt()
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

    // (d) Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string with leading and trailing spaces:");
        String input = sc.nextLine();

        // Using user-defined trim logic
        int[] indexes = findTrimIndexes(input);
        String trimmedByCharAt = "";

        if (indexes[0] <= indexes[1]) {
            trimmedByCharAt = createSubstring(input, indexes[0], indexes[1]);
        }

        // Using built-in trim()
        String trimmedByBuiltIn = input.trim();

        // Compare both strings
        boolean isSame = compareStrings(trimmedByCharAt, trimmedByBuiltIn);

        System.out.println("Trimmed using charAt(): \"" + trimmedByCharAt + "\"");
        System.out.println("Trimmed using built-in trim(): \"" + trimmedByBuiltIn + "\"");
        System.out.println("Are both results same? " + isSame);

        sc.close();
    }
}
