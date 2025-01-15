import java.util.Scanner;
public class FrequencyOfCharacters {
    public static int[] getFrequency(String text) {
        int[] freq = new int[256]; // ASCII size
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        return freq;
    }
    public static void displayFrequency(int[] freq) {
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int[] freq = getFrequency(text);
        displayFrequency(freq);
		sc.close();
    }
}
