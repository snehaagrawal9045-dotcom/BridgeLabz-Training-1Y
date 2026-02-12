package com.gla.Array.level1;
import java.util.Scanner;
public class TwoDToOneD {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // a. Take rows and columns input
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();

            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            // Create 2D array (matrix)
            int[][] matrix = new int[rows][cols];

            System.out.println("Enter matrix elements:");

            // Take matrix input
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix[i][j] = sc.nextInt();
                }
            }

            // b. Create 1D array of size rows*cols
            int[] array = new int[rows * cols];

            // c. Copy elements
            int index = 0;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[index] = matrix[i][j];
                    index++;
                }
            }

            // Print 2D array
            System.out.println("\n2D Array:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            // Print 1D array
            System.out.println("\n1D Array:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

            sc.close();
        }
}
