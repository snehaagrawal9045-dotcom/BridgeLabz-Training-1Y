package com.gla.Array.level1;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Get input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define array of size 10
        int[] table = new int[10];

        // b. Store multiplication results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // c. Display result
        System.out.println("\nMultiplication Table of " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }



}
