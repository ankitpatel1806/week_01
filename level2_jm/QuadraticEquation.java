import java.util.Scanner;
public class QuadraticEquation {
    // Method to find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;  // Calculate the discriminant (delta)
        double[] roots = new double[2];  // Array to hold the roots
        if (delta > 0) {
            // Two real roots
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);  // First root
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);  // Second root
        } else if (delta == 0) {
            // One real root
            roots[0] = roots[1] = -b / (2 * a);  // Both roots are equal
        } else {
            // No real roots, return an empty array
            return new double[0];
        }
		return roots;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get input values for a, b, and c
        System.out.print("Enter the value for a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value for b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value for c: ");
        double c = scanner.nextDouble();
        // Find the roots
        double[] roots = findRoots(a, b, c);
        // Display the roots or an appropriate message
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("The root of the equation is: " + roots[0]);
        } else {
            System.out.println("The roots of the equation are: " + roots[0] + " and " + roots[1]);
        }
        // Close scanner
        scanner.close();
    }
}
