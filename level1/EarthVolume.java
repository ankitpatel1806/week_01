//Program to calculate Volume of Earth in km³ and miles³
public class EarthVolume{
	public static void main(String[]args){
		double radiusKm = 6378.0;
        
        // Volume of sphere formula: (4/3) * pi * r³
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        
        // Conversion factor
        double volumeMiles3 = volumeKm3 * 0.239913;
        
        // Output
        System.out.println("The volume of Earth in cubic kilometers is "+ volumeKm3 + "\nThe volume of Earth in cubic miles is " +volumeMiles3);	
	}
}	
		