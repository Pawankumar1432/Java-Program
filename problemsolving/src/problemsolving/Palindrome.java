package problemsolving;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		
		if(rev == temp) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}

	sc.close();
	}

}
