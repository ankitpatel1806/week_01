import java.util.Scanner;

public class TextToLowerCaseComparison{

    // Method for converting each character to uppercase using ASCII values
    public static String convertToLowerCase(String inputText) {
        StringBuilder lowerCaseText = new StringBuilder();

        // Looping through each character in the text
        for (int i = 0; i < inputText.length(); i++) {
            char currentChar = inputText.charAt(i);

            // Checking if the character is lowercase and convert it to uppercase using ASCII values
            if (currentChar >= 'A' && currentChar <= 'Z') {
                char lowerCaseChar = (char) (currentChar + 32); // ASCII difference between lowercase and uppercase
                lowerCaseText.append(lowerCaseChar);
            } else {
                lowerCaseText.append(currentChar); // If character is already in uppercase
            }
        }

        return lowerCaseText.toString();
    }

    // Method for comparing two strings and return boolean result
    public static boolean compareStrings(String originalText, String lowerCaseText) {
		// Compareing the original text with the upper case version
        return originalText.equals(lowerCaseText);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the text : ");
        String inputText = sc.nextLine();

        // Converting the user input to lowercase using custom method
        String customUpperCaseText = convertToLowerCase(inputText);

        // Converting the user input to lowercase using the built-in toUpperCase() method
        String builtInUpperCaseText = inputText.toLowerCase();

        // Comparing the results using the user-defined method
        boolean areEqual = compareStrings(customUpperCaseText, builtInUpperCaseText);

        System.out.println("\nOriginal Text: " + inputText);
        System.out.println("Lowercase Text (Custom Method): " + customUpperCaseText);
        System.out.println("Lowercase Text (Built-in Method): " + builtInUpperCaseText);
        System.out.println("Are the two Lowecase texts equal? " + areEqual);
    }
}
