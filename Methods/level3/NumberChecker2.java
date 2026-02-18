package com.gla.Methods.level3;

public class NumberChecker2 {
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

    // b. Method to reverse digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    // c. Method to compare two arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }

        return true;
    }

    // d. Method to check Palindrome number
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // e. Method to check Duck Number
    // (Here: Duck number = contains at least one zero)
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0)
                return true;
        }
        return false;
    }

    // Main Method
    public static void main(String[] args) {

        int number = 101;  // Change number to test

        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Count of Digits: " + digitCount);

        int[] digits = getDigitsArray(number);

        System.out.print("Digits Array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int[] reversed = reverseArray(digits);
        System.out.print("Reversed Array: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Are Arrays Equal? " +
                areArraysEqual(digits, reversed));

        System.out.println("Is Palindrome? " +
                isPalindrome(digits));

        System.out.println("Is Duck Number? " +
                isDuckNumber(digits));
    }
}
