package day.one;
import java.util.Scanner;

public class BankApp {
public static void main(String[] args) {
int choice = 0;
Scanner scanner = new Scanner(System.in);

        System.out.println("            " + "          " + "Personal Details" );
        System.out.println("Enter First Name:");
        String firstName = scanner.next();
        System.out.println("Enter Last Name:");
        String lastName = scanner.next();
        System.out.println("Enter address:");
        String address = scanner.next();
        System.out.println("Enter city:");
        String city = scanner.next();
        System.out.println("Enter state:");
        String state = scanner.next();
        System.out.println("Enter pincode:");
        int pincode = scanner.nextInt();
        System.out.println("Enter country:");
        String country = scanner.next();
        System.out.println("Enter phonenumber:");
        int phonenumber = scanner.nextInt();
        System.out.println("Enter bloodgroup:");
        String bloodGroup = scanner.next();
        System.out.println("Enter email:");
        String email = scanner.next();
        System.out.println("Customer[ firstName=" + firstName + ", lastName=" + lastName
        + ", address=" + address+",city="+ city +",state= "+state+",pincode="+pincode+", country= "+country+", phonenumber="+phonenumber+"]" + "\n" + "           " + "I want to donate voluntarily and will not be entilted to claim any exchange for my donation. I guarantee that all the provided information is true."+"\n"+"I understand the questions,which are for my protection as well as to protect the receipient of my blood."
        +"I have read the requirements.I am eligible to donate blood");
       
       
   
}
}