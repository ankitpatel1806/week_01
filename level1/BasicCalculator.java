// program to make basic Calculator
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // ask the user to enter the first number
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        // ask the user to enter the second number
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // ask the arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = (number2 != 0) ? number1 / number2 : Double.POSITIVE_INFINITY; // Handle division by zero

        // Output the results
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+
                          number1 + " and "+number2 +", "+ addition +", "+ subtraction+", "+ multiplication +", "+ division);

        // Close the scanner object to avoid memory leaks
        input.close();
    }
}
