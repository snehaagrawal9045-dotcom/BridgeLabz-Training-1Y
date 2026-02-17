package com.gla.Strings.level3;
import java.util.Scanner;
public class DisplayCalendar {
    // Method to get month name
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to check Leap Year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get number of days in month
    public static int getNumberOfDays(int month, int year) {
        int[] days = {
                31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    // Method to get first day using Gregorian algorithm
    public static int getFirstDay(int year, int month) {

        int d = 1; // First day of month

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0; // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.println("\n     " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(year, month);
        int totalDays = getNumberOfDays(month, year);

        // First loop → indentation before 1st day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Second loop → print days
        for (int day = 1; day <= totalDays; day++) {

            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}
