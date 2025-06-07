
package exception;

import java.util.Scanner;

public class User {
	static String id="10";
	static String pass="12345";
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the User Id : ");
	String id=sc.nextLine();
	System.out.println("Enter the password : ");
	String pass=sc.nextLine();
	
	sc.close();
	if(id.equals(User.id)){
	if(pass.equals(User.pass)) {
		System.out.println("Sucess");
	}else {
		System.out.println("Invalid Password");
	}
 	}else {
		System.out.println("Invalid userId");
	}
	
	
}
}
