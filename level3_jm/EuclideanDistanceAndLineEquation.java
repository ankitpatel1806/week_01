import java.util.Scanner;

public class EuclideanDistanceAndLineEquation {

    // Method to find the Euclidean distance between two points (x1, y1) and (x2, y2)
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Using the Euclidean distance formula: distance = sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }

    // Method to find the equation of the line given two points (x1, y1) and (x2, y2)
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Slope m = (y2 - y1) / (x2 - x1)
        double slope = (y2 - y1) / (x2 - x1);
        
        // Y-intercept b = y1 - m * x1
        double yIntercept = y1 - slope * x1;
        
        // Return the slope and y-intercept as an array
        return new double[] {slope, yIntercept};
    }

    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input the first point (x1, y1)
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        
        // Input the second point (x2, y2)
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        
        // Calculate the Euclidean distance between the points
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between points: " + distance);
        
        // Find the equation of the line passing through the two points
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];
        
        // Print the equation of the line
        System.out.printf("Equation of the line: y = %.2fx + %.2f\n", slope, yIntercept);
        
        // Close the scanner
        scanner.close();
    }
}
