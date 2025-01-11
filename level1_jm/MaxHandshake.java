import java.util.Scanner;
public class MaxHandshake{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		//ASK INPUT FROM USER
		System.out.print("Enter the number of student : ");
		int students = scanner.nextInt();
		//calculation of handshake 
		int result = (students*(students-1))/2;
		System.out.println("The total number of Handshake "+ result +" .");
		//Scanner object close
		scanner.close();
	}
}