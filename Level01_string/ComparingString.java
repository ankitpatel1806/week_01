import java.util.Scanner;

public class ComparingString{

    // Method to compare two strings using charAt() method
    public static boolean compareStringsUsingCharAt(String StringOne, String StringTwo) {
        
		// If lengths are different, strings cannot be equal
        if (StringOne.length() != StringTwo.length()) {
            return false;
        }

        // Comparing each character of both strings
        for (int index = 0; index < StringOne.length(); index++) {
            if (StringOne.charAt(index) != StringTwo.charAt(index)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for two strings
        System.out.print("Enter the first string: ");
        String StringOne = sc.next();

        System.out.print("Enter the second string: ");
        String StringTwo = sc.next();

        // Comparing strings using charAt() method
        boolean isEqualUsingCharAt = compareStringsUsingCharAt(StringOne, StringTwo);

        // Comparing strings using String equals() method
        boolean isEqualUsingBuiltInMethod = StringOne.equals(StringTwo);

        // Displaying results
        System.out.println("Comparison result using charAt() method: " + isEqualUsingCharAt);
        System.out.println("Comparison result using String equals() method: " + isEqualUsingBuiltInMethod);

        // Checking if results are the same
        if (isEqualUsingCharAt == isEqualUsingBuiltInMethod) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("Methods produce different results.");
        }

        sc.close();
    }
}
