package com.gla.Methods.level1;
import java.util.Scanner;
public class NumberCheck {
    // Method to check number
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;      // Positive
        } else if (num < 0) {
            return -1;     // Negative
        } else {
            return 0;      // Zero
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Calling method
        int result = checkNumber(number);

        // Display result
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        sc.close();
    }
}
