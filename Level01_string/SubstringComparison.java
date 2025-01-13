import java.util.Scanner;

public class SubstringComparison{

    // Method to create a substring using charAt() method
    public static String createSubstringUsingCharAt(String text, int startIndex, int endIndex) {
        StringBuilder substringFormed = new StringBuilder();
        
		for (int index = startIndex; index < endIndex; index++) {
            substringFormed.append(text.charAt(index));
        }
        
		return substringFormed.toString();
    }


    // Method for comparing two strings using charAt() method
    public static boolean compareStringsUsingCharAt(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }
        for (int index = 0; index < firstString.length(); index++) {
            if (firstString.charAt(index) != secondString.charAt(index)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the main string
        System.out.print("Enter the main string : ");
        String inputString = sc.next();

        // Taking user input for start and end indices
        System.out.print("Enter the start index : ");
        int startIndex = sc.nextInt();

        System.out.print("Enter the end index : ");
        int endIndex = sc.nextInt();

        
		// Creating substring using charAt() method
        String substringUsingCharAt = createSubstringUsingCharAt(inputString, startIndex, endIndex);

        
		// Creating substring using built-in substring() method
        String substringUsingBuiltInMethod = inputString.substring(startIndex, endIndex);

        
		// Comparing the two substrings
        boolean isEqualUsingCharAt = compareStringsUsingCharAt(substringUsingCharAt, substringUsingBuiltInMethod);


        // Displaying results
        System.out.println("Substring using charAt() method: " + substringUsingCharAt);
        System.out.println("Substring using built-in substring() method: " + substringUsingBuiltInMethod);
        System.out.println("Comparison result: " + isEqualUsingCharAt);

        if (isEqualUsingCharAt) {
            System.out.println("Both methods produce the same result");
        } else {
            System.out.println("Methods produce different results");
        }

        sc.close();
    }
}

