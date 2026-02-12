package com.gla.Array.level2;
import java.util.Scanner;
public class BMIUsing2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // b. Create 2D array and status array
        // Column 0 = Weight
        // Column 1 = Height
        // Column 2 = BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // c. Take input for weight and height
        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));

            // Weight input validation
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (personData[i][0] <= 0);

            // Height input validation
            do {
                System.out.print("Enter height (m): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (personData[i][1] <= 0);
        }

        // d. Calculate BMI and weight status
        for (int i = 0; i < number; i++) {

            personData[i][2] = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // e. Display results
        System.out.println("\n--- BMI Report ---");

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.printf("BMI: %.2f\n", personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }

        sc.close();
    }
}
