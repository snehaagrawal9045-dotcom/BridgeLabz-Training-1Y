package com.gla.Array.level2;
import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            // Physics
            do {
                System.out.print("Physics: ");
                physics[i] = sc.nextDouble();
            } while (physics[i] < 0);

            // Chemistry
            do {
                System.out.print("Chemistry: ");
                chemistry[i] = sc.nextDouble();
            } while (chemistry[i] < 0);

            // Maths
            do {
                System.out.print("Maths: ");
                maths[i] = sc.nextDouble();
            } while (maths[i] < 0);

            // Calculate percentage
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

            // Assign grade
            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        // Display Result
        System.out.println("\n----- Result -----");

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " | Percentage: " + percentage[i] +
                    " | Grade: " + grade[i]);
        }

        sc.close();
    }
}
