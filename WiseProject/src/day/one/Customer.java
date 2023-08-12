package day.one;
import java.util.Scanner;

class Customer {
	
private int customerId;
private String firstName;
private String lastName;
private String address;
private String city;
private String state;
private int  pincode;
private String country;
private int phonenumber;
private String bloodGroup;
private String email;

static int count = 100;

Customer(String firstName, String lastName, String address ,String city,String state,int pincode,String country, int phonenumber,String bloodGroup,String email){
this.customerId = count++;
this.firstName = firstName;
this.lastName = lastName;
this.address = address;
this.city = city;
this.state = state;
this.pincode= pincode;
this.country = country;
this.phonenumber = phonenumber;
this.bloodGroup= bloodGroup;
this.email = email;

}

public int getCustomerId() {
return customerId;
}

public void setCustomerId(int customerId) {
this.customerId = customerId;
}

public String getFirstName() {
return firstName;
}


public void setFirstName(String firstName) {
this.firstName = firstName;
}


public String getLastName() {
return lastName;
}


public void setLastName(String lastName) {
this.lastName = lastName;
}


public String getAddress() {
return address;
}


public void setAddress(String address) {
this.address = address;
}
public String getcity() {
return city;
}

public void setcity(String city) {
this.city= city;
}

public String getstate() {
return state;
}


public void setstate(String state) {
this.state = state;
}


public int getpincode() {
return pincode;
}


public void setpincode(int pincode) {
this.pincode = pincode;
}
public String getcountry() {
return country;
}


public void setcountry(String country){
this.country= country;
}
public int getphonenumber() {
return phonenumber;
}


public void setphonenumber(int phonenumber){
this.phonenumber = phonenumber;
}

public void setbloodGroup(String bloodGroup){
this.bloodGroup = bloodGroup;
}
public String getbloodGroup() {
return bloodGroup;
}
public String getemail() {
return email;
}
public void setemail(String email) {
this.email= email;
}


public void show() {
System.out.println(customerId+ " " + firstName + " " + lastName + " " + address+" "+city+" "+state+" "+pincode+" "+country+" "+phonenumber);
}

@Override
public String toString() {
return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
+ ", address=" + address+",city="+ city +",state= "+state+",pincode="+pincode+", country= "+country+", phonenumber="+phonenumber+"]" + "\n"+"I want to donate voluntarily and will not be entilted to claim any exchange for my donation. I guarantee that all the provided information is true."+"\n"+"I understand the questions,which are for my protection as well as to protect the receipient of my blood."
+"I have read the requirements.I am eligible to donate blood";
}
Scanner scanner = new Scanner(System.in);


}

