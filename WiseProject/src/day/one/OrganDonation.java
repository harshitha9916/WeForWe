package day.one;

import java.util.Scanner;

public class OrganDonation {
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
		System.out.println("Enter the password:");
		String Password = scanner.next();
		System.out.println("Confirm the Password:");
		String Confirmpassword = scanner.next();
		//if(Confirmpassword == Password){
		    System.out.println("Enter the phone number:");
		    String MobileNumber = scanner.next();
		    System.out.println("Enter the MailId:");
		    String MailId = scanner.next();
		    System.out.println("Enter your date of birth(DD/MM/YYYY):");
		    String DateOfBirth = scanner.next();
		    System.out.println("Your sex(F/M/T/Others):");
		    String Sex = scanner.next();
		    System.out.println("Your weight:");
		    String Weight = scanner.next();
		    System.out.println("Address:");
		    String Adderss = scanner.next();
		    System.out.println("City:");
		    String City = scanner.next();
		    System.out.println("State:");
		    String State = scanner.next();
		    System.out.println("Your blood group:");
		    String Blood  = scanner.next();
		    System.out.println("Your want to donate for -");
		    System.out.println("1.Transplant Only.");
			System.out.println("2.Both transplant and Research.");
			String Choice = scanner.next();
			System.out.println("Qrgans that is wish to donate:");
		    System.out.println("1.Any body part");
		    System.out.println("2.Kidney");
		    System.out.println("3.Heart");
		    System.out.println("4.Lungs");
		    System.out.println("5.Bone");
		    System.out.println("6.Liver");
		    System.out.println("8.Eyes");
		    System.out.println("9.Skin");
			System.out.println("10.Others");
			String Organ = scanner.next();
		    if( Organ == "10" ){
		    	System.out.println("Enter what you want to donate:");
				String Others = scanner.next();
		    }
		    System.out.println("Any health issues?(Y/N)");
			String Issues = scanner.next();
			if(Issues == "Y"){
				System.out.println("Enter the issues:");
				System.out.println("1.HIV");
			    System.out.println("2.Cancer");
			    System.out.println("3.Diabetise");
			    System.out.println("4.Heart Issue");
			    System.out.println("5.Kidney Issue");
			    System.out.println("6.other issue");
				String HealthD = scanner.next();
				 if( HealthD == "6" ){
				    	System.out.println("Enter what you want is your problem:");
						String Other = scanner.next();
				    }

			}
		    System.out.println("Your registeration is Successfull. Please Login into your account");
	        System.out.println("   ");
		//}else{
			//System.out.println("Incorrect Password!!");
		//}
	   
	}

}
