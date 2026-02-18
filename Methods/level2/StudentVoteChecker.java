package com.gla.Methods.level2;
import java.util.Scanner;
public class StudentVoteChecker {
    // Method to check voting eligibility
    public boolean canStudentVote(int age) {

        // Negative age validation
        if (age < 0) {
            return false;
        }

        // Check if age is 18 or above
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            boolean result = checker.canStudentVote(ages[i]);

            if (result) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        sc.close();
    }
}

