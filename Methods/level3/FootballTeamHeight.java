package com.gla.Methods.level3;
import java.util.Arrays;
public class FootballTeamHeight {

    // b. Generate random heights between 150cm and 250cm
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); // 150 to 250 inclusive
        }
        return heights;
    }

    // c. Method to find sum of array elements
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }

    // d. Method to find mean height
    public static double findMeanHeight(int[] arr) {
        int sum = findSum(arr);
        return sum / (double) arr.length;
    }

    // e. Method to find shortest height
    public static int findShortestHeight(int[] arr) {
        int min = arr[0];
        for (int val : arr) {
            min = Math.min(min, val);
        }
        return min;
    }

    // f. Method to find tallest height
    public static int findTallestHeight(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            max = Math.max(max, val);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);

        System.out.println("Player Heights (cm): " + Arrays.toString(heights));

        double mean = findMeanHeight(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        System.out.printf("Mean Height = %.2f cm\n", mean);
        System.out.println("Shortest Height = " + shortest + " cm");
        System.out.println("Tallest Height = " + tallest + " cm");
    }
}
