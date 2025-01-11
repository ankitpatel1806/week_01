import java.util.Scanner;
public class SimpleInterest{
	//Method name and return statement
	public static double insterestCalculation(double principle, double rate, double time){
		double simpleInterset = (principle*rate*time)/100;
		return simpleInterset;
	}
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		//Ask input from user
		System.out.print("Enter principle Amount :  ");
		double principle = scanner.nextDouble();
		System.out.print("Enter Rate of Interest :  ");
		double rate =scanner.nextDouble();
		System.out.print("Enter Time :  ");
		double time =scanner.nextDouble();
		// Call the interestCalculation method to calculate interest
		double result = insterestCalculation(principle, rate, time);
		//output
		System.out.println("The Simple Interest is "+ result + " for Principal " + principle+ ", Rate of Interest "+ rate + " and Time "+time+" .");
		//Close scanner object 
		scanner.close();
		
		
	}
}