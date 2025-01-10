// Program to Calculate the handshakes amongs the stududents
import java.util.Scanner;

public class HandshakeCalculator {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes using the combination formula
        int numberOfHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the number of handshakes
        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is: " + numberOfHandshakes);

        // Close the scanner object
        scanner.close();
    }
}
