public class NullPointerExceptionDemo{

    // Method to generate NullPointerException
    public static void selfGeneratedNullPointerException() {
		// Initializing the variable to null
        String text = null; 
        
		
		// generating a NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleNullPointerException() {
		// Initialize the variable to null
        String text = null; 

        try {
            
			// Trying to call a method on the null variable
            System.out.println(text.length());
        } catch (NullPointerException e) {
            // Handling the exception and displaying the error message
            System.out.println("A NullPointerException occurred: " + e.getMessage());
        } catch (RuntimeException runtimeException) {
            System.out.println("RuntimeException caught: An unexpected error occurred.");
        }
    }

    public static void main(String[] args) {
        System.out.println("NullPointerException generation:");

        try {
			
			// Calling the method that generates the exception
            selfGeneratedNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught exception in selfGeneratedNullPointerException : " + e.getMessage());
        }

        // Calling the method that handles the exception
        System.out.println("\nNullPointerException handling :");
        handleNullPointerException();
    }
}
