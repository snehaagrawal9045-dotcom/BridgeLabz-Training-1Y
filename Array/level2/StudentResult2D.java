package com.gla.Array.level2;
import java.util.Scanner;
public class StudentResult2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // b. Create 2D array for marks
        // Column 0 = Physics
        // Column 1 = Chemistry
        // Column 2 = Maths
        double[][] marks = new double[n][3];

        double[] percentage = new double[n];
        char[] grade = new char[n];

        // c. Take input for marks
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {

                if (j == 0)
                    System.out.print("Physics: ");
                else if (j == 1)
                    System.out.print("Chemistry: ");
                else
                    System.out.print("Maths: ");

                marks[i][j] = sc.nextDouble();

                // If marks are negative, re-enter
                if (marks[i][j] < 0) {
                    System.out.println("Marks cannot be negative. Enter again.");
                    j--;   // repeat same subject
                }
            }
        }

        // d. Calculate percentage and grade using 2D array
        for (int i = 0; i < n; i++) {

            double total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            percentage[i] = total / 3.0;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 40)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        // e. Display results
        System.out.println("\n--- Student Results ---");

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);

            System.out.printf("Percentage: %.2f\n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

        sc.close();
    }
}
