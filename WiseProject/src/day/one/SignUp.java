package day.one;
import java.util.Scanner;

public class SignUp {
	private String FirstName;
	private String LastName;
	private String UserName;
	private String EmailId;
	private String MobileNumber;
	private String Password;
	private String Confirmpassword;
	
	SignUp(String FirstName,String LastName,String UserName,String EmailId,String MobileNumber,String Password,String ConfirmaPassword) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.UserName = UserName;
		this.EmailId = EmailId;
		this.MobileNumber = MobileNumber;
		this.Password = Password;
		this.Confirmpassword = Confirmpassword;
		
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirmpassword() {
		return Confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		Confirmpassword = confirmpassword;
	}
	public void show() {
		System.out.println(" " + FirstName + " " + LastName + " " + UserName + " " + EmailId + " " + MobileNumber + " " + Password +" " + Confirmpassword);
	}
	

}
