package com.gla.Strings.level2;
import java.util.Scanner;
public class ShortestLongestWord {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitText(String text) {

        int length = findLength(text);
        int wordCount = 1;

        // Count words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        // Last word
        words[index] = text.substring(start, length);

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] create2DArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    // Method to find shortest and longest word
    public static int[] findShortestLongest(String[][] wordData) {

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < wordData.length; i++) {

            int currentLength = Integer.parseInt(wordData[i][1]);
            int minLength = Integer.parseInt(wordData[minIndex][1]);
            int maxLength = Integer.parseInt(wordData[maxIndex][1]);

            if (currentLength < minLength) {
                minIndex = i;
            }

            if (currentLength > maxLength) {
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        // Split text
        String[] words = splitText(text);

        // Create 2D array
        String[][] wordData = create2DArray(words);

        // Find shortest and longest
        int[] result = findShortestLongest(wordData);

        int shortestIndex = result[0];
        int longestIndex = result[1];

        System.out.println("\nShortest Word: " + wordData[shortestIndex][0] +
                " (Length: " + wordData[shortestIndex][1] + ")");

        System.out.println("Longest Word: " + wordData[longestIndex][0] +
                " (Length: " + wordData[longestIndex][1] + ")");

        sc.close();
    }
}

