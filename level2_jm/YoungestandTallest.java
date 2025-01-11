import java.util.Scanner;
public class YoungestAndTallest{
    // Method to find the youngest friend
    public static String findYoungest(int[] ages) {
        int minAge = ages[0];
        String youngest = "Amar";
        if (ages[1] < minAge) {
            minAge = ages[1];
            youngest = "Akbar";
        }
        if (ages[2] < minAge) {
            minAge = ages[2];
            youngest = "Anthony";
        }
        return youngest;
    }
    // Method to find the tallest friend
    public static String findTallest(double[] heights) {
        double maxHeight = heights[0];
        String tallest = "Amar";
        if (heights[1] > maxHeight) {
            maxHeight = heights[1];
            tallest = "Akbar";
        }
        if (heights[2] > maxHeight) {
            maxHeight = heights[2];
            tallest = "Anthony";
        }
        return tallest;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Arrays to store the ages and heights of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        // Take input for the ages and heights of the three friends
        System.out.print("Enter age of Amar: ");
        ages[0] = scanner.nextInt();
        System.out.print("Enter height of Amar (in meters): ");
        heights[0] = scanner.nextDouble();
        System.out.print("Enter age of Akbar: ");
        ages[1] = scanner.nextInt();
        System.out.print("Enter height of Akbar (in meters): ");
        heights[1] = scanner.nextDouble();
        System.out.print("Enter age of Anthony: ");
        ages[2] = scanner.nextInt();
        System.out.print("Enter height of Anthony (in meters): ");
        heights[2] = scanner.nextDouble();
        // Find the youngest and tallest
        String youngest = findYoungest(ages);
        String tallest = findTallest(heights);
        // Display the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
        // Close scanner
        scanner.close();
    }
}
