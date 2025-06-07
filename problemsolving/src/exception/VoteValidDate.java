package exception;

import java.util.Scanner;
//checked Exception 
class InValidAgeToVote extends Exception{
	InValidAgeToVote(String message){
      super(message);		
	}
	public String toString(){
		return "hi user your Not Eligible to vote beacuse :"+ getMessage();	
	}
}
//unchecked Exception Runtime Exception
class InValidGender extends RuntimeException{
	InValidGender(String message){
		super(message);
	}
	public String toString(){
		return "hi user your Not Eligible to vote beacuse :"+ getMessage();	
	}
}
public class VoteValidDate {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age :");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Eligible to vote");
		}else {
			try {
				
				throw new InValidAgeToVote("InValidAge lessthen 18");
			}catch(InValidAgeToVote e) {
				e.printStackTrace();
//				System.err.println(e.toString());
			}
		}
		
		System.out.println("Enter the Gender only Male(M/F) :");
		char gender=sc.next().charAt(0);
		if(gender=='M') {
			System.out.println("Okay !");
		}else {
			throw new InValidGender("InValid Gender");
		}
	}

}
