package day.one;
import java.util.Scanner;

public class BloodDonation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		System.out.println("      " + "       " + "       " + "WEforWE");
		System.out.println("Hello!! Welcome to WEforWE. WE are here to help people who are in need the blood and organs at the time of emergency \n. And also want you to become a part ofWE by donating your1 blood and organs to the needy. \n. As a part of WEforWE we can organise donation camps and together raise awairness amoung people. \n. It also gives information regarding the donation of organs,blood and camps present\n.");
		System.out.println("1.Blood Donation.");
		System.out.println("2.Organ Donation.");
		System.out.println("3.Requrement of blood");
		System.out.println("4.Requrement of orgen.");
		System.out.println("5.Camp Participation.");
		System.out.println("Enter your choice:");
		choice = scanner.nextInt();
		do {
			
			switch(choice) {
			case 1 : 
				User user = new User();
				User.main(null);
				Login_s login = new Login_s();
				Login_s.main(null);
			    BankApp bank = new BankApp();
		        BankApp.main(null);
		        System.exit(0);
				
				break;
			case 2:
				System.out.println("Enter the organs that you want to donate");
				break;
			case 3:
				System.out.println("Where the blood should be donated.");
				break;
			case 4:
				System.out.println("Where the organ should be donated.");
				break;
			case 5:
				System.out.println("The camps present are:");
				break;

			case 6:
				return;
			
			}
		}while(choice < 7);
	}

}
