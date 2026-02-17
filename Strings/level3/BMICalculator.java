package com.gla.Strings.level3;
import java.util.Scanner;
public class BMICalculator {

    // (b) Method to calculate BMI and Status
    public static String[][] calculateBMI(int[][] data) {

        String[][] result = new String[data.length][4];
        // Column 0 = Height
        // Column 1 = Weight
        // Column 2 = BMI
        // Column 3 = Status

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];

            double heightMeter = heightCm / 100.0;

            double bmi = weight / (heightMeter * heightMeter);

            // Round BMI to 2 decimal places
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;

            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 30)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }

        return result;
    }

    // (c) Method to process data and return formatted result
    public static String[][] processData(int[][] data) {
        return calculateBMI(data);
    }

    // (d) Method to display result in tabular format
    public static void displayResult(String[][] result) {

        System.out.println("---------------------------------------------------------------");
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {

            System.out.println((i + 1) + "\t" +
                    result[i][0] + "\t\t" +
                    result[i][1] + "\t\t" +
                    result[i][2] + "\t\t" +
                    result[i][3]);
        }

        System.out.println("---------------------------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] data = new int[10][2];
        // Column 0 = Weight
        // Column 1 = Height (cm)

        // (a) Taking user input
        for (int i = 0; i < 10; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            data[i][0] = sc.nextInt();

            System.out.print("Enter Height (cm): ");
            data[i][1] = sc.nextInt();
        }

        String[][] result = processData(data);

        displayResult(result);

        sc.close();
    }
}
