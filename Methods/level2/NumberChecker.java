package com.gla.Methods.level2;
import java.util.Scanner;
public class NumberChecker {
    // a. Method to check if number is positive
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // b. Method to check if number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // c. Method to compare two numbers
    // returns 1 if num1 > num2, 0 if equal, -1 if num1 < num2
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // Take input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (isPositive(num)) {
                System.out.print(num + " is Positive");
                if (isEven(num)) {
                    System.out.println(" and Even");
                } else {
                    System.out.println(" and Odd");
                }
            } else {
                System.out.println(num + " is Negative");
            }
        }

        // Compare first and last element
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("First element is greater than last element.");
        } else if (result == 0) {
            System.out.println("First element is equal to last element.");
        } else {
            System.out.println("First element is less than last element.");
        }

        sc.close();
    }
}
