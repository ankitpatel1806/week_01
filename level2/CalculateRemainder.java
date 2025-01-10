// Program to Calculate reminder and Quitent
import java.util.Scanner;

public class CalculateRemainder {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: two numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;  // Using division operator for quotient
        int remainder = number1 % number2; // Using modulus operator for remainder

        // Output the result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two numbers " + number1 + " and " + number2);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}