package com.gla.Methods.level3;

public class NumberChecker {
    // a. Method to find count of digits
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

    // b. Method to store digits in array
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

    // c. Method to check Duck Number
    // (Here: Duck number = contains at least one zero)
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    // d. Method to check Armstrong Number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }

        return sum == number;
    }

    // e. Method to find largest and second largest
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }

    // f. Method to find smallest and second smallest
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + secondSmallest);
    }

    // Main Method
    public static void main(String[] args) {

        int number = 153;   // Change number to test

        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Count of Digits: " + digitCount);

        int[] digits = getDigitsArray(number);

        System.out.print("Digits Array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " +
                isArmstrongNumber(number, digits));

        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }
}
