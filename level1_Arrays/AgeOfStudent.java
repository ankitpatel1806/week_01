//program to store age of Students
import java.util.Scanner;

public class AgeOfStudent{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define an array to store the age of 10 students
        int[] ages = new int[10];
        
        // Loop through to take input for all 10 students' ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        
        // Loop through the array and check if the student can vote
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age for student " + (i + 1) + ".");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
