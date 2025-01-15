import java.util.Scanner;
public class WordLength {
    public static String[] splitTextIntoWords(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        String[] words = new String[wordCount];
        int wordIndex = 0;
        int startIndex = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || i == text.length() - 1) {
                if (i == text.length() - 1 && text.charAt(i) != ' ') {
                    i++;
                }
                words[wordIndex] = text.substring(startIndex, i).trim();
                wordIndex++;
                startIndex = i + 1;
            }
        }
        return words;
    }
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    public static String[][] getWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findLength(words[i]));
        }
        return wordLengths;
    }
    public static void displayWordLengths(String[][] wordLengths) {
        System.out.printf("%-15s%-10s\n", "Word", "Length");
        System.out.println("-----------------------------");
        for (String[] wordLength : wordLengths) {
            System.out.printf("%-15s%-10s\n", wordLength[0], wordLength[1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();
        String[] words = splitTextIntoWords(inputText);
        String[][] wordLengths = getWordLengths(words);
        displayWordLengths(wordLengths);
        scanner.close();
    }
}
