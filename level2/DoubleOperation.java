//Program to perform operations a + b *c, a * b + c, c + a / b, and a % b + c with Double
import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: three double values
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        // Compute the double operations considering operator precedence
        double result1 = a + b * c;   // a + (b * c)
        double result2 = a * b + c;   // (a * b) + c
        double result3 = c + a / b;   // c + (a / b)
        double result4 = a % b + c;   // (a % b) + c (note: modulus with doubles works differently in some cases)

        // Output the results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + " and " + result4);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
