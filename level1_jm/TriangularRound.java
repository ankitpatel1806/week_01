//Program to calculate Round of athlete i Trinagular
import java.util.Scanner;
public class TriangularRounds {
// Program to calculate triangluar path rounds
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; // 5 km in meters
        return (int) Math.ceil(distance / perimeter);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
		//Ask input from user
        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = scanner.nextDouble();
		//call function 
        int rounds = calculateRounds(side1, side2, side3);
		//output 
        System.out.println("Number of rounds to complete 5 km: " + rounds);
		//close Scanner object
        scanner.close();
    }
}
