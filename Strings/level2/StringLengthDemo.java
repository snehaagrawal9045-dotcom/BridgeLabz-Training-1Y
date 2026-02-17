package com.gla.Strings.level2;
import java.util.Scanner;
public class StringLengthDemo {
    // Method to find length without using length()
    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {   // Infinite loop
                text.charAt(count);  // Access character
                count++;
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index exceeds length
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined method
        int userLength = findLength(text);

        // Built-in method
        int builtInLength = text.length();

        // Display results
        System.out.println("Length using user-defined method: " + userLength);
        System.out.println("Length using built-in length(): " + builtInLength);

        sc.close();
    }
}
