//sample program two

import java.util.Scanner;

public class TravelComputation {
   
   public static void main(String[] args) {
      
      // Create a Scanner object to take user input
      Scanner scanner = new Scanner(System.in);

      // Ask the user to input the traveler's name
      System.out.print("Enter the name of the traveler: ");
      String name = scanner.nextLine();
      
      // Ask the user to input the starting city
      System.out.print("Enter the from city: ");
      String fromCity = scanner.nextLine();
      
      // Ask the user to input the city via which the traveler is passing
      System.out.print("Enter the via city: ");
      String viaCity = scanner.nextLine();
      
      // Ask the user to input the destination city
      System.out.print("Enter the to city: ");
      String toCity = scanner.nextLine();

      // Ask the user to input the distance between the fromCity and viaCity (in miles)
      System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
      double distanceFromToVia = scanner.nextDouble();
      
      // Ask the user to input the distance between the viaCity and toCity (in miles)
      System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
      double distanceViaToFinalCity = scanner.nextDouble();

      // Ask the user to input the time (in minutes) taken to travel from the fromCity to viaCity
      System.out.print("Enter the time taken to travel from " + fromCity + " to " + viaCity + " (in minutes): ");
      int timeFromToVia = scanner.nextInt();
      
      // Ask the user to input the time (in minutes) taken to travel from the viaCity to toCity
      System.out.print("Enter the time taken to travel from " + viaCity + " to " + toCity + " (in minutes): ");
      int timeViaToFinalCity = scanner.nextInt();

      // Calculate the total distance travelled
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Calculate the total time taken for the entire journey
      int totalTime = timeFromToVia + timeViaToFinalCity;

      // Display the travel details, including total distance and total time
      System.out.println("\nThe total distance travelled by " + name + " from " + fromCity + 
                         " to " + toCity + " via " + viaCity + " is " + totalDistance + " miles and " +
                         "the total time taken is " + totalTime + " minutes.");
      
      // Close the scanner to free up resources
      scanner.close();
   }
}
