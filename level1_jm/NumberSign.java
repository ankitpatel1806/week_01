//Program to find number wheather positive negetive and Zero
import java.util.Scanner;
public class NumberSign {
    // Method to check if the number is positive, negative, or zero
    public static int checkNumberSign(int number) {
        if (number > 0) {
            return 1; // Positive
        } else if (number < 0) {
            return -1; // Negative
        } else {
            return 0; // Zero
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Check and display the result
        int result = checkNumberSign(number);
        System.out.println("Result: " + result);
        scanner.close();
    }
}
