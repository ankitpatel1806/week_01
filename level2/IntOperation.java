//Program to perform operations a + b *c, a * b + c, c + a / b, and a % b + c
import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: three integer values
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value of c: ");
        int c = scanner.nextInt();

        // Compute the integer operations considering operator precedence
        int result1 = a + b * c;   // a + (b * c)
        int result2 = a * b + c;   // (a * b) + c
        int result3 = c + a / b;   // c + (a / b)
        int result4 = a % b + c;   // (a % b) + c

        // Output the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and " + result3 + " and " + result4);

        // Close the scanner to prevent leak
        scanner.close();
    }
}
