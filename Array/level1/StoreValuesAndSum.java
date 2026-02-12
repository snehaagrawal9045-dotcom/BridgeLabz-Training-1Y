package com.gla.Array.level1;
import java.util.Scanner;
public class StoreValuesAndSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Declare array and variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (0 or negative number to stop):");

        // b. Infinite while loop
        while (true) {

            System.out.print("Enter number: ");
            double input = sc.nextDouble();

            // c. Break if 0 or negative
            if (input <= 0) {
                break;
            }

            // d. Break if array size reaches 10
            if (index == 10) {
                break;
            }

            // e. Store value and increment index
            numbers[index] = input;
            index++;
        }

        // f. Calculate total using for loop
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // g. Display total
        System.out.println("Total sum = " + total);

        sc.close();
    }
}
