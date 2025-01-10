//Program to check Number Harshad Number
import java.util.Scanner;

public class HarshadNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number; 
        int sum = 0;

        // Calculate the sum of digits
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += digit;            // Add the digit to sum
            number /= 10;            // Remove the last digit
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        sc.close();
    }
}
