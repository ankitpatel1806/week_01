import java.util.Scanner;
public class FrequencyUsingUniqueCharacters {
    public static char[] findUniqueCharacters(String text) {
        int len = text.length();
        char[] uniqueChars = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }
        // Return only unique characters up to the count
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }
    public static int[] getFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        return freq;
    }
    public static void displayFrequency(char[] uniqueChars, int[] freq) {
        System.out.println("Frequency of unique characters:");
        for (char c : uniqueChars) {
            if (c != '\0') {
                System.out.println(c + ": " + freq[c]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        char[] uniqueChars = findUniqueCharacters(text);
        int[] freq = getFrequency(text);
        displayFrequency(uniqueChars, freq);
		sc.close();
    }
}
