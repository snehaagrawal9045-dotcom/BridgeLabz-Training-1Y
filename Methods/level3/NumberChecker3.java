package com.gla.Methods.level3;

public class NumberChecker3 {

    // a. Method to check Prime Number
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // b. Method to check Neon Number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == number;
    }

    // c. Method to check Spy Number
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }

    // d. Method to check Automorphic Number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;

        while (temp > 0) {
            if ((temp % 10) != (square % 10))
                return false;

            temp /= 10;
            square /= 10;
        }

        return true;
    }

    // e. Method to check Buzz Number
    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    // Main Method
    public static void main(String[] args) {

        int number = 7;  // Change number to test

        System.out.println("Number: " + number);

        System.out.println("Is Prime? " + isPrime(number));
        System.out.println("Is Neon? " + isNeon(number));
        System.out.println("Is Spy? " + isSpy(number));
        System.out.println("Is Automorphic? " + isAutomorphic(number));
        System.out.println("Is Buzz? " + isBuzz(number));
    }
}
