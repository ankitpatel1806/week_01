//program to calculate Simple Interest
import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Ask the user to input the rate of interest
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        // Ask the user to input the time period
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate the Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time);

        // Close the scanner to prevent memory leak
        scanner.close();
    }
}
