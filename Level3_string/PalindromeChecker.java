import java.util.Scanner;
public class PalindromeChecker {
    // Logic 1: Iterative Palindrome Check
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    // Logic 2: Recursive Palindrome Check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    // Logic 3: Using Character Arrays for Palindrome Check
    public static boolean isPalindromeUsingArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reversedArray[i] = originalArray[text.length() - 1 - i];
        }

        for (int i = 0; i < text.length(); i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        // Check palindrome using all three methods
        System.out.println("Using Iterative Method: " + isPalindromeIterative(text));
        System.out.println("Using Recursive Method: " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Using Array Method: " + isPalindromeUsingArray(text));
		
		sc.close();
    }
}
