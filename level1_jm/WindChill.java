import java.util.Scanner;
public class WindChill {
    // Method to calculate wind chill temperature using the formula
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Wind Chill Formula
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in)
        double temperature = scanner.nextDouble();
        double windSpeed = scanner.nextDouble();
        // Calculate and display the wind chill temperature
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("Wind chill temperature: " + windChill);
    }
}
