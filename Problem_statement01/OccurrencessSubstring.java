//Program to find occurrences of substring
import java.util.Scanner;
public class OccurrencessSubstring {
    public static int countOccurrences(String str, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // move the index forward to avoid counting the same substring
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String str = scanner.nextLine();
        System.out.println("Enter the substring to search for:");
        String subStr = scanner.nextLine();
        int occurrences = countOccurrences(str, subStr);
        System.out.println("The substring occurs " + occurrences + " times.");
    }
}
