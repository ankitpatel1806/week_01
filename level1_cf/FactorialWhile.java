//program to fing Factorial using While loop
import java.util.Scanner;

class FactorialWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the input is a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Compute factorial using a while loop
            int factorial = 1;
            int currentMultiplier = 1;

            while (currentMultiplier <= number) {
                factorial *= currentMultiplier;
                currentMultiplier++;
            }

            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        sc.close();
    }
}
