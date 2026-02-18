package com.gla.Methods.level3;

public class NumberChecker1 {
    // a1. Method to count digits
    public static int countDigits(int number) {
        number = Math.abs(number);
        if (number == 0) return 1;

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // a2. Method to store digits in array
    public static int[] getDigitsArray(int number) {
        number = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // b. Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // c. Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // d. Method to check Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // e. Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        // First column = digit (0–9)
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        // Count frequency
        for (int digit : digits) {
            freq[digit][1]++;
        }

        return freq;
    }

    // Main Method
    public static void main(String[] args) {

        int number = 21;   // Change number to test

        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Count of Digits: " + digitCount);

        int[] digits = getDigitsArray(number);

        System.out.print("Digits Array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));

        System.out.println("Is Harshad Number? " +
                isHarshadNumber(number, digits));

        // Frequency
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] != 0) {
                System.out.println("Digit " + frequency[i][0] +
                        " -> " + frequency[i][1] + " times");
            }
        }
    }
}
