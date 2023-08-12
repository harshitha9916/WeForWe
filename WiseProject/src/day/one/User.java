package day.one;
import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		int choice = 0;
		SignUp signup = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("  " + "   " + "           " + "Registration Form");
		System.out.println("Enter the FirstName:");
		String FirstName = scanner.next();
		System.out.println("Enter the LastName:");
		String LastName = scanner.next();
		System.out.println("Enter the UserName:");
		String UserName = scanner.next();
		System.out.println("Enter the MailId:");
		String MailId = scanner.next();
		System.out.println("Enter the phone number:");
		String MobileNumber = scanner.next();
		System.out.println("Enter the password:");
		String Password = scanner.next();
		System.out.println("Confirm the Password:");
		String Confirmpassword = scanner.next();
	    System.out.println("Your registeration is Successfull. Please Login into your account");
	    System.out.println("   ");
	   
	}
}
