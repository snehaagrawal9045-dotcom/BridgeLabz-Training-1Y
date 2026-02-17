package com.gla.Strings.level3;
import java.util.Scanner;
public class UniqueCharacters {
    // (a) Method to find length without using length()
    public static int findLength(String str) {

        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // When index goes out of bounds, loop stops
        }

        return count;
    }

    // (b) Method to find unique characters
    public static char[] findUniqueCharacters(String str) {

        int len = findLength(str);

        char[] temp = new char[len];  // Temporary array
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {

            char current = str.charAt(i);
            boolean isUnique = true;

            // Check with previous characters
            for (int j = 0; j < i; j++) {
                if (current == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // (iii) Create new array of exact size
        char[] uniqueChars = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to display characters
    public static void display(char[] arr) {

        System.out.print("Unique Characters: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // (c) Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] unique = findUniqueCharacters(input);

        display(unique);

        sc.close();
    }
}
