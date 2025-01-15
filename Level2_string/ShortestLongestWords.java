import java.util.Scanner;
public class ShortestLongestWords {
    public static String[] findShortestAndLongestWords(String[][] wordLengths) {
        String shortestWord = wordLengths[0][0];
        String longestWord = wordLengths[0][0];
        int minLength = Integer.parseInt(wordLengths[0][1]);
        int maxLength = Integer.parseInt(wordLengths[0][1]);
        for (String[] wordLength : wordLengths) {
            int length = Integer.parseInt(wordLength[1]);
            if (length < minLength) {
                shortestWord = wordLength[0];
                minLength = length;
            }
            if (length > maxLength) {
                longestWord = wordLength[0];
                maxLength = length;
            }
        }
        return new String[]{shortestWord, longestWord};
    }

    public static String[] findWordsManually(String text) {
        int wordCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++;
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();
        String[] words = findWordsManually(inputText);
        String[][] wordLengths = getWordLengths(words);
        String[] result = findShortestAndLongestWords(wordLengths);
        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
        scanner.close();
    }
}
