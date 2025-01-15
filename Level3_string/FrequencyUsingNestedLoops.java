import java.util.Scanner;
public class FrequencyUsingNestedLoops {
    public static void displayFrequency(String text) {
        char[] textChars = text.toCharArray();
        boolean[] visited = new boolean[text.length()];

        System.out.println("Character Frequencies:");

        for (int i = 0; i < textChars.length; i++) {
            if (visited[i]) {
                continue; // Skip already visited characters
            }
            char currentChar = textChars[i];
            int count = 1; // Start count at 1 for the current character

            // Compare with remaining characters
            for (int j = i + 1; j < textChars.length; j++) {
                if (textChars[j] == currentChar) {
                    count++;
                    visited[j] = true; // Mark as visited
                }
            }
            System.out.println(currentChar + ": " + count);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        displayFrequency(text);
		sc.close();
	}
}
