import java.util.Scanner;
public class StudentVoteChecker {
    // Method to check if a student can vote based on their age
    public static boolean canStudentVote(int age) {
        // Validate if age is negative
        if (age < 0) {
            return false;
        }
        return age >= 18;  // Student can vote if age is 18 or above
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create an array to store the ages of 10 students
        int[] studentAges = new int[10];        
        // Loop to input the age of 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }
        // Check whether each student can vote
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        // Close scanner
        scanner.close();
    }
}
