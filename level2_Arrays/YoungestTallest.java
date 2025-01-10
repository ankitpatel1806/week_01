import java.util.Scanner;
//Find the Youngest and Tallest Friend
public class YoungestTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare arrays for age and height
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Find youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest: " + (youngestIndex == 0 ? "Amar" : youngestIndex == 1 ? "Akbar" : "Anthony"));
        System.out.println("Tallest: " + (tallestIndex == 0 ? "Amar" : tallestIndex == 1 ? "Akbar" : "Anthony"));
    }
}
