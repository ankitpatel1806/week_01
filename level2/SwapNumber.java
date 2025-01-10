// Swap two Number
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take two numbers as input
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Swap the numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Print the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        // Close the scanner to prevent memory leak
        scanner.close();
    }
}
