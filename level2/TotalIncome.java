// To calculate the total Income of a person taking input as salary and bonus
import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take salary and bonus as input
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your bonus: ");
        double bonus = scanner.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Print the result
		System.out.println("The salary is INR "+ salary + "and bonus is INR "+ bonus+". Hence Total Income is INR "+totalIncome+" ."; 
        // Close the scanner to prevent memory leak
        scanner.close();
    }
}