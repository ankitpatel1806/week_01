import java.util.Scanner;
public class EligibilityVoting {
    public static int[] getAges(int numStudents) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        return ages;
    }
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            eligibility[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                eligibility[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                eligibility[i][1] = "Can Vote";
            } else {
                eligibility[i][1] = "Cannot Vote";
            }
        }
        return eligibility;
    }
    public static void displayEligibility(String[][] eligibility) {
        System.out.println("Age\tEligibility");
        System.out.println("-------------------------");
        for (String[] entry : eligibility) {
            System.out.println(entry[0] + "\t" + entry[1]);
        }
    }
    public static void main(String[] args) {
        int numStudents = 10;
        int[] ages = getAges(numStudents);
        String[][] eligibility = checkVotingEligibility(ages);
        displayEligibility(eligibility);
    }
}
