import java.util.Scanner;

public class CharacterArrayCreationAndComparison{

    // Method to return characters in a string without using toCharArray()
    public static char[] getCharactersUsingLoop(String text) {
        
		char[] charactersArray = new char[text.length()];
        
		for (int index = 0; index < text.length(); index++) {
            charactersArray[index] = text.charAt(index);
        }
        
		return charactersArray;
    }

    // Method to compare two character arrays
    public static boolean compareCharacterArrays(char[] firstArray, char[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }
        
		for (int index = 0; index < firstArray.length; index++) {
            if (firstArray[index] != secondArray[index]) {
                return false;
            }
        }
        
		return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter the string : ");
        String userInputString = sc.next();

        // Getting characters using user-defined method
        char[] charactersUsingLoop = getCharactersUsingLoop(userInputString);

        // Getting characters using built-in toCharArray() method
        char[] charactersUsingBuiltInMethod = userInputString.toCharArray();

        // Comparing the two character arrays
        boolean areArraysEqual = compareCharacterArrays(charactersUsingLoop, charactersUsingBuiltInMethod);

        // Displaying results
        System.out.println("Characters using user-defined method: " + String.valueOf(charactersUsingLoop));
        System.out.println("Characters using built-in toCharArray() method: " + String.valueOf(charactersUsingBuiltInMethod));
        System.out.println("Comparison result: " + areArraysEqual);

        if (areArraysEqual) {
            System.out.println("Both methods produce the same result");
        } else {
            System.out.println("Methods produce different results");
        }

        sc.close();
    }
}
