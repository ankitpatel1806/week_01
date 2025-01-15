import java.util.Scanner;
public class UniqueCharacters {
    public static int getLength(String text) {
        int length = 0;
        while (true) {
            try {
                char ch = text.charAt(length);
                length++;
            } catch (Exception e) {
                break;
            }
        }
        return length;
    }
    public static char[] findUniqueCharacters(String text) {
        int len = getLength(text);
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
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);
        displayUniqueCharacters(uniqueChars);
		sc.close();
    }
}
