package com.gla.Strings.level3;
import java.util.Scanner;
public class FrequencyWithunique {

    // (a) Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String str) {

        char[] temp = new char[str.length()];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);
            boolean isUnique = true;

            // Nested loop to check previous characters
            for (int j = 0; j < i; j++) {
                if (current == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count] = current;
                count++;
            }
        }

        // Create exact size array
        char[] unique = new char[count];
        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    // (b) Method to calculate frequency using unique characters
    public static String[][] findFrequency(String str) {

        int[] frequency = new int[256];  // ASCII array

        // (ii) Count frequency of characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        // (iii) Get unique characters
        char[] unique = uniqueCharacters(str);

        // (iv) Create 2D array
        String[][] result = new String[unique.length][2];

        // (v) Store unique characters and their frequency
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(frequency[unique[i]]);
        }

        return result;
    }

    // Method to display result
    public static void display(String[][] data) {

        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println("   " + data[i][0] + "\t\t   " + data[i][1]);
        }
    }

    // (c) Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = findFrequency(input);

        display(result);

        sc.close();
    }
}
