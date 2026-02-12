package com.gla.Array.level1;
import java.util.Scanner;
public class TableFromSixToNine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store results (6,7,8,9 → total 4 values)
        int[] multiplicationResult = new int[4];

        // b. Store multiplication from 6 to 9
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // c. Display result
        System.out.println("\nMultiplication Table from 6 to 9:");

        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }

        sc.close();
    }
}
