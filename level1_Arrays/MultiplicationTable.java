import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for the number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();
        
        // Create an array to store multiplication results
        int[] multiplicationTable = new int[10];
        
        // Run a loop from 1 to 10 and store the results in the array
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }
        
        // Display the multiplication table
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }
     
        scanner.close();
    }
}
