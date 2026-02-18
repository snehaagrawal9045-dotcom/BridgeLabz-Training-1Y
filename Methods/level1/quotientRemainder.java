package com.gla.Methods.level1;
import java.util.Scanner;
public class quotientRemainder {
    // Method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        if (divisor != 0) {
            // Calling method
            int[] result = findRemainderAndQuotient(number, divisor);

            System.out.println("Quotient is: " + result[0]);
            System.out.println("Remainder is: " + result[1]);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        sc.close();
    }
}
