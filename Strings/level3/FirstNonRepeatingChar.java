package com.gla.Strings.level3;
import java.util.Scanner;
public class FirstNonRepeatingChar {
    // (b) Method to find first non-repeating character
    public static char findFirstNonRepeating(String str) {

        int[] frequency = new int[256];  // ASCII size

        // (ii) Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;  // ASCII value used as index
        }

        // (iii) Find first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }

        return '\0';  // If no non-repeating character found
    }

    // (c) Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeating(input);

        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found.");
        }

        sc.close();
    }
}
