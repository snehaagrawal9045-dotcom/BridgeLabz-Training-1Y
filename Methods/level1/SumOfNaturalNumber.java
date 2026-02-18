package com.gla.Methods.level1;
import java.util.Scanner;
public class SumOfNaturalNumber {
    // Method to calculate sum using loop
    public static int findSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a positive integer (n): ");
        int n = sc.nextInt();

        if (n > 0) {
            int result = findSum(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + result);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}
