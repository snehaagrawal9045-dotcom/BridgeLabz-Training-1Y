package com.gla.Array.level1;
import java.util.Scanner;
public class VotingCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Define array of 10 integer elements
        int[] ages = new int[10];

        // Take input
        System.out.println("Enter ages of 10 students:");

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\nVoting Eligibility Result:");

        // b. Loop through array and check condition
        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.out.println("The student with the age " + ages[i] + " has invalid age.");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}
