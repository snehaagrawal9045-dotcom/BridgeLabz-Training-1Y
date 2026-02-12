package com.gla.Array.level2;
import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // b. Count digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        // c. Store digits in array
        int[] digits = new int[count];
        temp = number;
        int index = 0;

        while (temp != 0) {
            digits[index] = temp % 10;  // get last digit
            temp = temp / 10;           // remove last digit
            index++;
        }

        // d. Frequency array (0-9 digits)
        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;   // increase count of that digit
        }

        // e. Display frequency
        System.out.println("\nDigit Frequencies:");

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
