//Program to Remove duplicate from String
import java.util.Scanner;
public class DuplicateRemover {
    public static String removeDuplicateCharacters(String input) {
        // StringBuilder to build the result string
        StringBuilder result = new StringBuilder();
        
        // Iterate over each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if the character is already in the result string
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);  // Append the character if not already present
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        String modifiedString = removeDuplicateCharacters(input);
        
        System.out.println("String after removing duplicates: " + modifiedString);
    }
}

