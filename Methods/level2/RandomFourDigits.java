package com.gla.Methods.level2;

public class RandomFourDigits {
    // a. Method to generate array of 4 digit random numbers
    public static int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000;
            // Generates number between 1000 and 9999
        }

        return numbers;
    }

    // b. Method to find average, min and max
    public static double[] findAverageMinMax(int[] numbers) {

        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;

            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        int size = 5;

        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.println("Generated 4-Digit Random Numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        double[] results = findAverageMinMax(randomNumbers);

        System.out.println("\nAverage: " + results[0]);
        System.out.println("Minimum: " + (int)results[1]);
        System.out.println("Maximum: " + (int)results[2]);
    }
}
