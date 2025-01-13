//Program to Find most Frequent Character
import java.util.Scanner;
public class MostFrequentCharacter {
    public static char findMostFrequentCharacter(String str) {
        // Create an array to store the frequency of each character (assuming ASCII characters)
        int[] frequency = new int[256];  // Array size 256 for ASCII characters
        // Iterate over each character in the string and update the frequency array
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }
        // Find the character with the highest frequency
        int maxCount = 0;
        char mostFrequentChar = str.charAt(0);        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequency[ch] > maxCount) {
                maxCount = frequency[ch];
                mostFrequentChar = ch;
            }
        }
        return mostFrequentChar;
    }
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        // Find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(str);

        // Print the result
        System.out.println("Most frequent character: " + mostFrequentChar);
    }
}
