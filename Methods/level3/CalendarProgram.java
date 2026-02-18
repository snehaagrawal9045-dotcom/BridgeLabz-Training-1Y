package com.gla.Methods.level3;
import java.util.Scanner;
public class CalendarProgram {
    // a. Method to get month name
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        return months[month - 1];
    }

    // Leap Year Method
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // b. Method to get number of days in month
    public static int getDaysInMonth(int month, int year) {

        int[] days = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    // c. Method to get first day using Gregorian algorithm
    // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    public static int getFirstDay(int month, int year) {

        int m = month;
        int y = year;

        if (m < 3) {
            m += 12;
            y--;
        }

        int k = y % 100;
        int j = y / 100;

        int h = (1 + (13 * (m + 1)) / 5 + k + (k / 4)
                + (j / 4) + 5 * j) % 7;

        // Convert to Sunday = 0 format
        int dayOfWeek = (h + 6) % 7;

        return dayOfWeek;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        int firstDay = getFirstDay(month, year);

        System.out.println("\n   " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // d(i). First loop for indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // d(ii). Second loop to print days
        for (int date = 1; date <= days; date++) {

            System.out.printf("%3d ", date);

            if ((firstDay + date) % 7 == 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}
