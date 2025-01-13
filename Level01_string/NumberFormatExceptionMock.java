import java.util.Scanner;

public class NumberFormatExceptionMock{

    // Method for generating NumberFormatException
    public static void generateNumberFormatException(String inputText) {
       
	   // Trying to convert a non-numeric string to an integer which will throw NumberFormatException
        Integer.parseInt(inputText); 
    }

    // Method for handling the exception using try-catch block
    public static void handleNumberFormatException(String inputText) {
        try {
            
			// Calling the method to generate the exception
            generateNumberFormatException(inputText);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("\nNumberFormatException caught : The input is not a valid integer");
        } catch (RuntimeException runtimeException) {
            System.out.println("RuntimeException caught: An unexpected error occurred.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString; // Variable to store user input

        // Taking user input
        System.out.print("Enter a string that represents a number : ");
        inputString = sc.nextLine();


		try{
			// calling the method that generates the exception
			System.out.println("Attempting to generate NumberFormatException...");
			generateNumberFormatException(inputString); // This will cause an exception if input is invalid
		}catch(Exception e){
			
			 // calling the method to handle the exception
			System.out.println("\n\nNow handling the exception...");
			handleNumberFormatException(inputString); // This will catch and handle the exception
			
		}
    }
}
