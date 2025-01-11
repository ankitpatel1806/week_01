import java.util.Scanner;
public class TrigonometricFunctions {
    // Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); 
        double[] results = new double[3];
        // Calculate trigonometric functions
        results[0] = Math.sin(radians); 
        results[1] = Math.cos(radians); 
        results[2] = Math.tan(radians); 
        return results;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input for the angle in degrees
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        // Calculate and display the trigonometric values
        double[] results = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
        scanner.close();
    }
}
