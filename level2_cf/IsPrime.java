//check wheather number is prime or not
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();
        
        // Initialize the isPrime variable to true
        boolean isPrime = true;
        
        // Check if the number is less than or equal to 1
        if (number <= 1) {
            isPrime = false;  // Numbers less than or equal to 1 are not prime
        } else {
            // Loop through all numbers from 2 to number-1
            for (int i = 2; i < number/2; i++) {
                if (number % i == 0) {
                    isPrime = false;  // If a divisor is found, it's not prime
                    break;  // Exit the loop early
                }
            }
        }
        
        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
