//program to check Palindrome String
import java.util.Scanner;
public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to make the check case-insensitive
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        // Compare characters from both ends of the string
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  
            }
            left++;
            right--;
        }
        return true;  // If all characters match, it is a palindrome
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();  
        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
