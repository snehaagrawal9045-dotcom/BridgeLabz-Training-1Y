package com.gla.Strings.level2;
import java.util.Scanner;

    public class CharacterTypeDemo {

            // Method to check character type
            public static String checkCharacter(char ch) {

                // Convert uppercase to lowercase using ASCII
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + 32);
                }

                // Check if it is a letter
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

            // Method to create 2D array of character and its type
            public static String[][] findCharacterTypes(String text) {

                String[][] result = new String[text.length()][2];

                for (int i = 0; i < text.length(); i++) {
                    result[i][0] = String.valueOf(text.charAt(i));
                    result[i][1] = checkCharacter(text.charAt(i));
                }

                return result;
            }

            // Method to display 2D array in tabular format
            public static void displayTable(String[][] data) {

                System.out.println("\nCharacter\tType");
                System.out.println("--------------------------");

                for (int i = 0; i < data.length; i++) {
                    System.out.println(data[i][0] + "\t\t" + data[i][1]);
                }
            }

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String text = sc.nextLine();

                String[][] result = findCharacterTypes(text);

                displayTable(result);

                sc.close();
            }
    }


