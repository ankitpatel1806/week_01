import java.util.Scanner;
public class NaturalNumbersSum {
    // Method to calculate the sum of natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumUsingRecursion(n - 1);
        }
    }
    // Method to calculate the sum of natural numbers using the formula
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // Take user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        // Ensure input is a valid natural number
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Compute sum using recursion and formula
            int sumRecursion = sumUsingRecursion(n);
            int sumFormula = sumUsingFormula(n);
            
            // Compare and display the results
            System.out.println("Sum using recursion: " + sumRecursion);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Both sums are " + (sumRecursion == sumFormula ? "equal" : "different"));
        }    
        // Close scanner
        scanner.close();
    }
}
