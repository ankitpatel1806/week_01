import java.util.Scanner;
public class StringLength{
	public static int stringLength(String str){
		int count=0;
		try{
			while(true){
				str.charAt(count);
				count++;
				}
			}
			catch (StringIndexOutOfBoundsException e) {
            return count;
			}
		}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String to find lenght " );
		String str = sc.nextLine();
		int result = stringLength(str);
		System.out.println("The lenght of string "+ result);
		System.out.println("The lenght of string "+ str.length());
		sc.close();
	}
}	