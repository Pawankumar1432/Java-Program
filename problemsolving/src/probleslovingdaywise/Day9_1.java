package probleslovingdaywise;

import java.util.Scanner;

public class Day9_1 {
	/**
	 * Day 9: Java Practice Task
	 * 
	 * Question: Digit Sum Analysis with Conditional Checks
	 * 
	 * Problem Statement: Write a Java program to find the sum of even digits and
	 * odd digits in a given number. Based on the comparison of these two sums,
	 * perform different checks:
	 * 
	 * Case 1: If the even digit sum is greater, check whether the given number is a
	 * prime number.
	 * 
	 * Case 2: If the odd digit sum is greater, check whether the given number is an
	 * Armstrong number.
	 * 
	 * Case 3: If both even digit sum and odd digit sum are equal, check whether the
	 * given number is a palindrome number.
	 * 
	 * Note: You must define and use the following methods:
	 * 
	 * boolean isPrime(int num) boolean isArmstrong(int num) boolean
	 * isPalindrome(int num) Sample Input 1: Enter number: 1234
	 * 
	 * Even digits sum = 2 + 4 = 6 Odd digits sum = 1 + 3 = 4 Since even sum > odd
	 * sum → check if 1234 is prime Output: 1234 is not a Prime number
	 * 
	 * Sample Input 2: Enter number: 153
	 * 
	 * Even digits sum = 0 Odd digits sum = 1 + 5 + 3 = 9 Since odd sum > even sum →
	 * check if 153 is Armstrong Output: 153 is an Armstrong number
	 * 
	 * 
	 * Sample Input 3: Enter number: 121
	 * 
	 * Even digits sum = 2 Odd digits sum = 1 + 1 = 2 Sums are equal → check if 121
	 * is Palindrome Output: 121 is a Palindrome number
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");

		int n = sc.nextInt();
		int n1 = n;
		int evenSum = 0, oddSum = 0;
		while (n > 0) {
			int digit = n % 10;
			if (digit % 2 == 0) {
				evenSum += digit;
			} else {
				oddSum += digit;
			}
			n /= 10;
		}
 		int choice = 0;
	
		if (evenSum > oddSum) {
			choice = 1;
		} else if (evenSum < oddSum) {
			choice = 2;
		} else {
			choice = 3;
		}
 		switch (choice) {
		case 1:
			if (isPrime(n1)) {
				System.out.println(n1+" is a Prime number");
			} else {
				System.out.println(n1 + " is not a Prime number");
			}
			break;
		case 2:
			
			if (isArmstrong(n1)) {
				System.out.println(n1+" is a Armstrong number");
			} else {
				System.out.println(n1 + " is not a Armstrong number");
			}
			break;
		case 3:

			if (isPalindrome(n1)) {
				System.out.println(n1+" is a Palindrome number");
			} else {
				System.out.println(n1 + " is not a Palindrome number");
			}
			break;

		}

	}

	private static boolean isPalindrome(int n1) {
		int n=n1;
		int rev=0;
		while(n1>0) {
			int digit=n1%10;
			rev=rev*10+digit;
			n1/=10;
		}
		if(n==rev)return true;
 		return false;
	}

	private static boolean isArmstrong(int n1) {
		int n=n1;
		int sum=0;
		while(n1>0) {
			int digit=n1%10;
			sum+=digit*digit*digit;
			n1/=10;
		}
		if(sum==n)return true;
 		return false;
	}

	private static boolean isPrime(int n1) {
		
		if(n1<=1)return false;
		
		for(int i=2;i<n1;i++) {
			if(n1%i==0)return false;
		}
 		return true;
	}

}
