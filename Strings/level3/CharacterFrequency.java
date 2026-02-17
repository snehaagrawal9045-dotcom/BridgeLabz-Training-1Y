package com.gla.Strings.level3;
import java.util.Scanner;
public class CharacterFrequency {

    // (a) Method to calculate frequency and return 2D array
    public static String[][] findFrequency(String str) {

        int[] frequency = new int[256];   // ASCII size

        // (ii) Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // (iii) Create 2D array for characters and frequencies
        String[][] result = new String[uniqueCount][2];

        int index = 0;

        // (iv) Store characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
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

    // (b) Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = findFrequency(input);

        display(result);

        sc.close();
    }
}
