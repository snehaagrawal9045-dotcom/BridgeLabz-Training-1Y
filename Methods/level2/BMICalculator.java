package com.gla.Methods.level2;
import java.util.Scanner;
public class BMICalculator {
    // Method to calculate BMI and populate the array
    public static void calculateBMI(double[][] data) {
        // data[i][0] = weight in kg, data[i][1] = height in cm, data[i][2] = BMI
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightMeters = data[i][1] / 100.0; // convert cm to meters
            double bmi = weight / (heightMeters * heightMeters);
            data[i][2] = bmi; // store BMI in 3rd column
        }
    }

    // Method to determine BMI status
    public static String[] determineStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // 10 persons, columns: weight, height, BMI

        // Take input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Determine BMI status
        String[] status = determineStatus(data);

        // Display results
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    (i + 1), data[i][0], data[i][1], data[i][2], status[i]);
        }

        sc.close();
    }

}
