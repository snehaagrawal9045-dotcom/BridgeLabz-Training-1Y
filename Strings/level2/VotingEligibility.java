package com.gla.Strings.level2;
import java.util.Scanner;
public class VotingEligibility {
    // (a) Method to take ages of n students and return 1D array
    public static int[] getStudentAges(int n, Scanner sc) {
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    // (b) Method to check voting eligibility and return 2D String array
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);  // Store age

            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote (Invalid Age)";
            }
            else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            }
            else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    // (c) Method to display 2D array in tabular format
    public static void displayResult(String[][] data) {

        System.out.println("\n---------------------------------");
        System.out.println("Age\t\tVoting Status");
        System.out.println("---------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }

        System.out.println("---------------------------------");
    }

    // (d) Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfStudents = 10;

        // Take input
        int[] ages = getStudentAges(numberOfStudents, sc);

        // Check eligibility
        String[][] result = checkVotingEligibility(ages);

        // Display result
        displayResult(result);

        sc.close();
    }
}
