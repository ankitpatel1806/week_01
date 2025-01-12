import java.util.Random;
public class FootballTeam {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();

        // Generating random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101);  // Random number between 150 and 250
        }
        // Display the generated heights
        System.out.println("Heights of players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
        // Calculate and display the results
        int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
    // Method to calculate the sum of all heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    // Method to calculate the mean height
    public static double calculateMean(int sum, int numberOfPlayers) {
        return (double) sum / numberOfPlayers;
    }
    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }
    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}
