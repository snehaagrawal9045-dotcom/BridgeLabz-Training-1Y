package com.gla.Methods.level3;
import java.util.Scanner;
public class StudentScoreCard {
    // b. Generate random 2-digit PCM scores
    public static int[][] generateScores(int students) {

        int[][] scores = new int[students][3]; // P C M

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 90) + 10; // 10–99
            }
        }

        return scores;
    }

    // c. Calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {

        int n = scores.length;
        double[][] results = new double[n][3];
        // Column 0 → Total
        // Column 1 → Average
        // Column 2 → Percentage

        for (int i = 0; i < n; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // d. Display scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {

        System.out.println("--------------------------------------------------------------");
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\t");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {

            System.out.println((i+1) + "\t"
                    + scores[i][0] + "\t"
                    + scores[i][1] + "\t"
                    + scores[i][2] + "\t"
                    + results[i][0] + "\t"
                    + results[i][1] + "\t"
                    + results[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);

        displayScorecard(scores, results);

        sc.close();
    }
}
