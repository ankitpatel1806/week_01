//program to calculate the total price of an item
import java.util.Scanner;

public class PurchasePriceCalculator {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for unit price and quantity
        System.out.print("Enter the unit price of the item (in INR): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity of items: ");
        int quantity = scanner.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Display the total price
        System.out.println(" The quantity is " + quantity 
                           + " and the unit price is INR " + unitPrice + "The total purchase price is INR " + totalPrice 
                           +".");

        // Close the scanner object
        scanner.close();
    }
}
