// Program to Count Vowels and Consonants
import java.util.Scanner;
public class CountVowelsConsonants {
    public static void countVowels(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        // Convert the string to lowercase to simplify checking
        str = str.toLowerCase();
        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {  // Check if the character is a letter
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        
        countVowels(str);
    }
}
