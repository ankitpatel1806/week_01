//Program Reverse a String
import java.util.Scanner;
public class ReverseString{
    public static String reverseString(String str) {
        String reverse = "";
        // Loop through the string in reverse order and build the reversed string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        
        return reverse;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		//Ask input from user
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        String reversedString = reverseString(str);
        System.out.println("Reversed string: " + reversedString);
		scanner.close();
    }
}
