package probleslovingdaywise;

import java.util.Scanner;

public class Day1_1 {
	public static void main(String[] args) {
		
		// Prime Digits in a Number
		/**
		 *  Prime Digits in a Number
		 *  Problem Statement:
		 *  Write a Java program to extract and print only the prime digits from a given number.
		 *  Sample Input:
		 *  Enter a number: 984567
		 *  Sample Output:
		 *  Prime digits: 5, 7
		 * 
		 * */
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		int rev=0;
		while(n>0) {
			
			int digit=n%10;
			if(isPrime(digit)) {
				 rev=rev*10+digit;
			}
			n/=10;
		}
		System.out.print("Prime digits: ");
		int rev1=0;
		while(rev>0) {
			
			int d=rev%10;
			rev1=rev1*10+d;
			if(rev/10!=0) {
				System.out.print(rev1%10+",");
			}else {
				System.out.print(rev1%10);
		}
			rev/=10;
		}
		 
	}

	private static boolean isPrime(int digit) {
		if(digit==1) {
			return false;
		}
		for(int i=2;i<digit;i++) {
			if(digit%i==0) {
				return false;
			}
		}
 		return true;
	}


}
