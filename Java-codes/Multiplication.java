
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Multiply
        int result = num1 * num2;

        // Output
        System.out.println("Multiplication result: " + result);

        sc.close();
    }
}
