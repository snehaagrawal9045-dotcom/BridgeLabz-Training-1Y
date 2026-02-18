package com.gla.Methods.level2;
import java.util.Scanner;
public class SumOfNaturalRecursive {
    // Method using recursion
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    // Method using formula
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {

            int recursiveResult = sumRecursive(n);
            int formulaResult = sumFormula(n);

            System.out.println("Sum using recursion: " + recursiveResult);
            System.out.println("Sum using formula (n*(n+1)/2): " + formulaResult);

            if (recursiveResult == formulaResult) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("Results are not equal.");
            }

        } else {
            System.out.println("Please enter a valid natural number (greater than 0).");
        }

        sc.close();
    }
}
