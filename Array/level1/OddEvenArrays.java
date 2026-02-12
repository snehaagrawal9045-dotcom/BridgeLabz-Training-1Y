package com.gla.Array.level1;
import java.util.Scanner;
public class OddEvenArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check Natural Number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            return;   // Exit program
        }

        // b. Create arrays
        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        // c. Index variables
        int evenIndex = 0;
        int oddIndex = 0;

        // d. Store numbers
        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        // e. Print odd numbers
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        // Print even numbers
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}
