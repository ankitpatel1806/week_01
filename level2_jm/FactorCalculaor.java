import java.util.Scanner;
public class FactorsCalculator {
    // This method calculates the factors of a given number and stores them in an array
    public static int[] findFactors(int num) {
        int count = 0;
        // First loop to count the number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        // Initialize the array with the number of factors
        int[] factors = new int[count];
        int index = 0;
        // Second loop to store the factors in the array
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    // Method to calculate the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    // Method to calculate the product of factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    // Method to calculate the sum of squares of factors
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        // Ask user for the number input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        // Call the method to find factors
        int[] factors = findFactors(num);        
        // Display the factors
        System.out.print("Factors of " + num + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        // Calculate and display the sum, product, and sum of squares of factors
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(factors));
        // Close scanner to free resources
        scanner.close();
    }
}
