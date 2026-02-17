package com.gla.Strings.level2;

public class StudentScoreCard {
    // (a) Method to generate random 2-digit PCM scores
    public static int[][] generateScores(int n) {

        int[][] scores = new int[n][3];  // 3 subjects: PCM

        for (int i = 0; i < n; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10; // Physics
            scores[i][1] = (int)(Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int)(Math.random() * 90) + 10; // Maths
        }

        return scores;
    }

    // (b) Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] scores) {

        double[][] result = new double[scores.length][3];
        // Column 0 = Total
        // Column 1 = Average
        // Column 2 = Percentage

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    // (c) Method to calculate Grade
    public static String[][] calculateGrade(double[][] result) {

        String[][] grades = new String[result.length][1];

        for (int i = 0; i < result.length; i++) {

            double percentage = result[i][2];

            if (percentage >= 90)
                grades[i][0] = "A+";
            else if (percentage >= 80)
                grades[i][0] = "A";
            else if (percentage >= 70)
                grades[i][0] = "B";
            else if (percentage >= 60)
                grades[i][0] = "C";
            else if (percentage >= 50)
                grades[i][0] = "D";
            else
                grades[i][0] = "F";
        }

        return grades;
    }

    // (d) Method to display Scorecard
    public static void displayScoreCard(int[][] scores, double[][] result, String[][] grades) {

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAverage\t\tPercent\t\tGrade");
        System.out.println("-------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {

            System.out.println((i+1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t\t" +
                    result[i][2] + "%\t\t" +
                    grades[i][0]);
        }

        System.out.println("-------------------------------------------------------------------------------------");
    }

    // Main method
    public static void main(String[] args) {

        int numberOfStudents = 5;   // You can change this

        int[][] scores = generateScores(numberOfStudents);

        double[][] result = calculateResults(scores);

        String[][] grades = calculateGrade(result);

        displayScoreCard(scores, result, grades);
    }
}
