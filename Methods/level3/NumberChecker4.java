package com.gla.Methods.level3;

public class NumberChecker4 {
    // Helper Method: Find sum of proper divisors
    public static int sumOfProperDivisors(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    // a. Check Perfect Number
    public static boolean isPerfect(int number) {
        return sumOfProperDivisors(number) == number;
    }

    // b. Check Abundant Number
    public static boolean isAbundant(int number) {
        return sumOfProperDivisors(number) > number;
    }

    // c. Check Deficient Number
    public static boolean isDeficient(int number) {
        return sumOfProperDivisors(number) < number;
    }

    // Helper Method: Factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // d. Check Strong Number
    public static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    // Main Method
    public static void main(String[] args) {

        int number = 28;   // Change number to test

        System.out.println("Number: " + number);

        System.out.println("Is Perfect? " + isPerfect(number));
        System.out.println("Is Abundant? " + isAbundant(number));
        System.out.println("Is Deficient? " + isDeficient(number));
        System.out.println("Is Strong? " + isStrong(number));
    }
}
