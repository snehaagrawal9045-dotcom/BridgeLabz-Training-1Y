package com.gla.Strings.level3;
import java.util.Scanner;
public class CharacteraFrequency {
    // Method to find frequency of characters
    public static String[] findFrequency(String text) {

        char[] chars = text.toCharArray();      // Convert string to char array
        int[] freq = new int[chars.length];     // Frequency array

        // Step 1: Count frequency using nested loops
        for (int i = 0; i < chars.length; i++) {

            freq[i] = 1;   // Initialize frequency to 1

            if (chars[i] == '0')   // Skip already counted characters
                continue;

            for (int j = i + 1; j < chars.length; j++) {

                if (chars[i] == chars[j]) {
                    freq[i]++;        // Increase frequency
                    chars[j] = '0';   // Mark duplicate as '0'
                }
            }
        }

        // Step 2: Store result in 1D String array
        String[] result = new String[chars.length];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " = " + freq[i];
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] output = findFrequency(input);

        System.out.println("\nCharacter Frequencies:");

        for (String s : output) {
            if (s != null)
                System.out.println(s);
        }

        sc.close();
    }
}
