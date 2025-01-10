/*program to calculate the Area of traingle and An athlete run 5km 
find how many round he have to run */
import java.util.Scanner;  

public class RunTrianglePark {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        // Input sides of the triangle  
        System.out.print("Enter the length of side 1 (in meters): ");  
        double side1 = scanner.nextDouble();  
        
        System.out.print("Enter the length of side 2 (in meters): ");  
        double side2 = scanner.nextDouble();  
        
        System.out.print("Enter the length of side 3 (in meters): ");  
        double side3 = scanner.nextDouble();  

        // Calculate the perimeter  
        double perimeter = side1 + side2 + side3;  

        // Total distance to run in meters 
        double totalDistance = 5000; 

        // Calculate number of rounds  
        double numberOfRounds = totalDistance / perimeter;  

        // To complete the total distance, round up to the nearest whole number  
        int totalRounds = (int) Math.ceil(numberOfRounds);  

        // Output the result  
        System.out.println("The total number of rounds the athlete will run is " + totalRounds + " to complete 5 km.");  

        // Close the scanner  
        scanner.close();  
    }  
}