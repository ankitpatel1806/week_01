import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionMock{

    // Method for generating StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String text) {
        // Attempt to access an index beyond the string length
        System.out.println("Character at index beyond length: " + text.charAt(text.length() + 1));
    }

    // Method for handling StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            
			// Attempt to access an index beyond the string length
            System.out.println("Character at index beyond length: " + text.charAt(text.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            
			// Handle the exception and display an error message
            System.out.println("A StringIndexOutOfBoundsException occurred: " + e.getMessage());
        } catch (RuntimeException runtimeException) {
            System.out.println("RuntimeException caught: An unexpected error occurred.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string : ");
        String userInputString = sc.next();

        // Calling the method that generates the exception
        System.out.println("Demonstrating StringIndexOutOfBoundsException generation : ");
        try {
            generateStringIndexOutOfBoundsException(userInputString);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("\n\nCaught exception in main : " + e.getMessage());
        }

        // Calling the method that handles the exception
        System.out.println("\n\nDemonstrating StringIndexOutOfBoundsException handling  :");
        handleStringIndexOutOfBoundsException(userInputString);

        sc.close();
    }
}
