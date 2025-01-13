import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionMock{

    // Method for generating ArrayIndexOutOfBoundsException
    public static void generatedArrayIndexOutOfBoundsException(String[] namesArray, int index) {
        
		// Trying to access an index that is out of bounds of the array
        System.out.println("\nAccessing index " + index + ": " + namesArray[index]);
    }

    // Method for handling the exception using try-catch block
    public static void handleArrayIndexOutOfBoundsException(String[] namesArray, int index) {
        try {
            // Calling the method to generate the exception
            generatedArrayIndexOutOfBoundsException(namesArray, index);
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("\nArrayIndexOutOfBoundsException caught: The index " + index + " is out of bounds.");
        } catch (RuntimeException runtimeException) {
            System.out.println("\nRuntimeException caught: An unexpected error occurred.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		
		// Taking input for the array of names
        System.out.print("Enter the number of names you want to input : ");
        int numberOfNames = sc.nextInt();
		
		// Array to store names input by the user
        String[] namesArray = new String[numberOfNames];
		
		
		// Storing a index to access the array and generate the ArrayIndexOutOfBoundsException 
        int indexToAccess = numberOfNames;
        sc.nextLine(); // Consume the leftover newline character

        // Taking names input from the user
        for (int i = 0; i < numberOfNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            namesArray[i] = sc.nextLine();
        }


		try{
			
			// First calling the method to generate the exception
			System.out.println("\nAttempting to generate ArrayIndexOutOfBoundsException...");
			generatedArrayIndexOutOfBoundsException(namesArray, indexToAccess); // This will cause an exception if the index is out of bounds
		
		} catch(Exception e){
			
			// After the exception we call the method to handle it
			System.out.println("\nNow handling the exception...");
			handleArrayIndexOutOfBoundsException(namesArray, indexToAccess); // This will catch and handle the exception
		}
		
		sc.close();
	}
}
