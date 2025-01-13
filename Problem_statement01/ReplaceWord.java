//Program to Replace Word as specific word
import java.util.Scanner;
public class ReplaceWord {
    public static String replaceWord(String sentence, String target, String replacement) {
        return sentence.replace(target, replacement);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        System.out.println("Enter the word to replace:");
        String target = scanner.nextLine();
        System.out.println("Enter the replacement word:");
        String replacement = scanner.nextLine();
        String modifiedSentence = replaceWord(sentence, target, replacement);
        System.out.println("Modified sentence: " + modifiedSentence);
    }
}
