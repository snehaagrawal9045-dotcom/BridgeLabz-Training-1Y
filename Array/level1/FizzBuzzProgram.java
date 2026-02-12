package com.gla.Array.level1;
import java.util.Scanner;
public class FizzBuzzProgram {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Take input
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            // Check positive integer
            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            // a. Create String array
            String[] result = new String[number + 1];

            // Loop from 0 to number
            for (int i = 0; i <= number; i++) {

                if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                    result[i] = "FizzBuzz";
                }
                else if (i % 3 == 0 && i != 0) {
                    result[i] = "Fizz";
                }
                else if (i % 5 == 0 && i != 0) {
                    result[i] = "Buzz";
                }
                else {
                    result[i] = String.valueOf(i);
                }
            }

            // b. Print results
            System.out.println("\nFizzBuzz Results:");

            for (int i = 0; i <= number; i++) {
                System.out.println("Position " + i + " = " + result[i]);
            }

            sc.close();
        }
}
