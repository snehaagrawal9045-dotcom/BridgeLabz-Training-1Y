package com.gla.Array.level2;
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = 10;

        // b. Arrays
        double[] salary = new double[size];
        double[] yearsOfService = new double[size];
        double[] bonus = new double[size];
        double[] newSalary = new double[size];

        // c. Total variables
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // d. Take input with validation
        for (int i = 0; i < size; i++) {

            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Years of Service: ");
            yearsOfService[i] = sc.nextDouble();

            // Validation
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--;  // Decrement index to repeat this employee
            }
        }

        // e. Calculate bonus & totals
        for (int i = 0; i < size; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;   // 5%
            } else {
                bonus[i] = salary[i] * 0.02;   // 2%
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // f. Print totals
        System.out.println("\nTotal Bonus Payout = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}
