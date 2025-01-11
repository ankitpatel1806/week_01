import java.util.Scanner;
public class MaximumHandshake{
//FUNCTION TO CALCULATE HANDSHAKE
	public static int numHandshake( int number){
		int handshake = (number*(number-1))/2;
		return handshake;
		}
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		//ASK INPUT FROM USER
		System.out.print("Enter the number of student : ");
		int students = scanner.nextInt();
		int result = numHandshake(students);
		System.out.println("The total number of Handshake "+ result +" .");
		//Scanner object close
		scanner.close();
	}
}