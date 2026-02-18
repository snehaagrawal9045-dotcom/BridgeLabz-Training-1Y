package com.gla.Methods.level3;

public class FactorUtility {
    // a. Method to find factors and return as array
    public static int[] getFactors(int number) {

        // First loop → count factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array
        int[] factors = new int[count];

        // Second loop → store factors
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // b. Method to find greatest factor
    public static int greatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;

        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }

        return max;
    }

    // c. Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // d. Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // e. Method to find product of cube of factors
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Main Method
    public static void main(String[] args) {

        int number = 12;  // Change number to test

        System.out.println("Number: " + number);

        int[] factors = getFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));
    }
}
