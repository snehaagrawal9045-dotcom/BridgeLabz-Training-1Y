package com.gla.Methods.level2;
import java.util.Scanner;
public class FactorProgram {
    // Method to find factors and return as array
    public static int[] findFactors(int number) {

        int count = 0;

        // First loop: count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array with exact size
        int[] factors = new int[count];
        int index = 0;

        // Second loop: store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    public static int findProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {

            // Find factors
            int[] factors = findFactors(number);

            System.out.print("Factors are: ");
            for (int factor : factors) {
                System.out.print(factor + " ");
            }

            System.out.println("\nSum of factors: " + findSum(factors));
            System.out.println("Product of factors: " + findProduct(factors));
            System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));

        } else {
            System.out.println("Please enter a positive number.");
        }

        sc.close();
    }
}
