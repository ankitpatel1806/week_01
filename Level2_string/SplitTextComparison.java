import java.util.Scanner;
public class SplitTextComparison {
    public static String[] findWordsManually(String text) {
        int wordCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++ ;
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
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();
        String[] manualWords = findWordsManually(inputText);
        String[] splitWords = inputText.split("\\s+");  // Split based on spaces
        boolean areEqual = compareArrays(manualWords, splitWords);
        System.out.println("Words using manual method: ");
        for (String word : manualWords) {
            System.out.println(word);
        }
        System.out.println("\nWords using split() method: ");
        for (String word : splitWords) {
            System.out.println(word);
        }
        System.out.println("\nAre both methods' results equal? " + areEqual);
        scanner.close();
    }
}
