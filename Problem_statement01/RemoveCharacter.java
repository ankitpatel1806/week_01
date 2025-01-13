//Program to find Remove Character 
import java.util.Scanner;
public class RemoveCharacter {
    public static String removeCharacter(String str, char chToRemove) {
        return str.replaceAll(String.valueOf(chToRemove), "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        System.out.println("Enter the character to remove:");
        char chToRemove = scanner.next().charAt(0);

        String modifiedString = removeCharacter(str, chToRemove);

        System.out.println("Modified string: " + modifiedString);
    }
}
