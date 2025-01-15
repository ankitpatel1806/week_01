import java.util.Scanner;
public class VowelConsonantCounter {
    public static String checkCharacterType(char c) {
        c = Character.toLowerCase(c);
        if ("aeiou".indexOf(c) != -1) {
            return "Vowel";
        } else if (Character.isLetter(c)) {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }
    public static int[] countVowelsAndConsonants(String text) {
        int[] counts = new int[2];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            String type = checkCharacterType(c);
            if (type.equals("Vowel")) {
                counts[0]++;
            } else if (type.equals("Consonant")) {
                counts[1]++;
            }
        }
        return counts;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        int[] counts = countVowelsAndConsonants(inputText);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
        scanner.close();
    }
}