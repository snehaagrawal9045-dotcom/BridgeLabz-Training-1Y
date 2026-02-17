package com.gla.Strings.level2;
import java.util.Scanner;
public class VowelConsonantCount {


        // Method to check if character is vowel or consonant
        public static String checkCharacter(char ch) {

            // Convert uppercase to lowercase using ASCII
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            // Check if letter
            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    return "Vowel";
                } else {
                    return "Consonant";
                }

            } else {
                return "Not a Letter";
            }
        }

        // Method to count vowels and consonants
        public static int[] countVowelsConsonants(String text) {

            int vowelCount = 0;
            int consonantCount = 0;

            for (int i = 0; i < text.length(); i++) {

                char ch = text.charAt(i);
                String result = checkCharacter(ch);

                if (result.equals("Vowel")) {
                    vowelCount++;
                } else if (result.equals("Consonant")) {
                    consonantCount++;
                }
            }

            return new int[]{vowelCount, consonantCount};
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = sc.nextLine();

            int[] counts = countVowelsConsonants(text);

            System.out.println("\nNumber of Vowels: " + counts[0]);
            System.out.println("Number of Consonants: " + counts[1]);

            sc.close();
        }
}
