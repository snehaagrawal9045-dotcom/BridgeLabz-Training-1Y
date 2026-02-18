package com.gla.Methods.level2;
import java.util.Scanner;
public class LeapYearProgram {

    // Method to check Leap Year
    public static boolean isLeapYear(int year) {

        // Condition a: Year must be >= 1582 (Gregorian calendar)
        if (year < 1582) {
            return false;
        }

        // Condition b: Leap year rules
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year >= 1582) {

            if (isLeapYear(year)) {
                System.out.println("Year " + year + " is a Leap Year.");
            } else {
                System.out.println("Year " + year + " is NOT a Leap Year.");
            }

        } else {
            System.out.println("Leap year calculation is valid only for year >= 1582.");
        }

        sc.close();
    }
}
