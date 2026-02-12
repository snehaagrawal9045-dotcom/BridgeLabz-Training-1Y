package com.gla.Array.level2;
import java.util.Scanner;
public class DynamicLargestSecondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();   // long to allow bigger numbers

        if (number < 0) {
            number = -number;
        }

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits with dynamic resizing
        while (number != 0) {

            // a. If array full → increase size by 10
            if (index == maxDigit) {

                maxDigit = maxDigit + 10;

                // b. Create temp array
                int[] temp = new int[maxDigit];

                // Copy old data
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign new array
                digits = temp;
            }

            digits[index] = (int)(number % 10);
            number = number / 10;
            index++;
        }

        // Find largest and second largest
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);

        sc.close();
    }
}
