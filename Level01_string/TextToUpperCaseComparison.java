import java.util.Scanner;

public class TextToUpperCaseComparison{

    // Method for converting each character to uppercase using ASCII values
    public static String convertToUpperCase(String inputText) {
        StringBuilder upperCaseText = new StringBuilder();

        // Looping through each character in the text
        for (int i = 0; i < inputText.length(); i++) {
            char currentChar = inputText.charAt(i);

            // Checking if the character is lowercase and convert it to uppercase using ASCII values
            if (currentChar >= 'a' && currentChar <= 'z') {
                char upperCaseChar = (char) (currentChar - 32); // ASCII difference between lowercase and uppercase
                upperCaseText.append(upperCaseChar);
            } else {
                upperCaseText.append(currentChar); // If character is already in uppercase
            }
        }

        return upperCaseText.toString();
    }

    // Method for comparing two strings and return boolean result
    public static boolean compareStrings(String originalText, String upperCaseText) {
		// Compareing the original text with the upper case version
        return originalText.equals(upperCaseText);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInputText; // Variable to store user input

        // Taking user input
        System.out.print("Enter the text: ");
        userInputText = sc.nextLine();

        // Converting the user input to uppercase using custom method
        String customUpperCaseText = convertToUpperCase(userInputText);

        // Converting the user input to uppercase using the built-in toUpperCase() method
        String builtInUpperCaseText = userInputText.toUpperCase();

        // Comparing the results using the user-defined method
        boolean areEqual = compareStrings(customUpperCaseText, builtInUpperCaseText);

        System.out.println("\nOriginal Text: " + userInputText);
        System.out.println("Uppercase Text (Custom Method): " + customUpperCaseText);
        System.out.println("Uppercase Text (Built-in Method): " + builtInUpperCaseText);
        System.out.println("Are the two uppercase texts equal? " + areEqual);
    }
}
