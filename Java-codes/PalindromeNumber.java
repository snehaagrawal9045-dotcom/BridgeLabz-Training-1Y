import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = scanner.nextInt();
        int originalNum = num; // Store the original number
        int reverseNum = 0;
        int remainder;

        // Reverse the number using a while loop
        while (num != 0) {
            remainder = num % 10; // Get the last digit
            reverseNum = reverseNum * 10 + remainder; // Append the digit to the reverse number
            num /= 10; // Remove the last digit
        }

        // Check if the original number is equal to the reversed number
        if (originalNum == reverseNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }
        scanner.close();
    }
}