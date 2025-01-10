//Program to find Sum until zero using Do while
import java.util.Scanner;
class SumUntilZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0; // Initialize total
        int userInput;  // Variable to store user input

        // Taking input from user and continuing the process until 0 is entered
        do {
            System.out.print("Enter a Number (Enter 0 to stop) - ");
            userInput = sc.nextInt();
            total += userInput; // Add input to total
        } while (userInput != 0);

        System.out.println("The total sum is: " + total);
        sc.close();
    }
}
