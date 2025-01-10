// Program to distribute of N number of chochlate in M number of student
import java.util.Scanner;

public class ChocolateDistribution {

    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        // Ask the user to input the number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calculate the number of chocolates each child gets
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        // Calculate the number of remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);

        // Close the scanner to prevent memory leak
        scanner.close();
    }
}
