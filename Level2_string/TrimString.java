import java.util.Scanner;
public class TrimString {
    public static int[] findTrimIndices(String text) {
        int startIndex = 0;
        int endIndex = text.length() - 1;
        while (startIndex <= endIndex && text.charAt(startIndex) == ' ') {
            startIndex++;
        }
        while (endIndex >= startIndex && text.charAt(endIndex) == ' ') {
            endIndex--;
        }
        return new int[]{startIndex, endIndex};
    }
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String inputText = sc.nextLine();
        int[] indices = findTrimIndices(inputText);
        String trimmedText = createSubstring(inputText, indices[0], indices[1]);
        if (trimmedText.equals(inputText.trim())) {
            System.out.println("Trimmed string matches with built-in trim().");
        } else {
            System.out.println("Trimmed string does not match.");
        }
        sc.close();
    }
}
