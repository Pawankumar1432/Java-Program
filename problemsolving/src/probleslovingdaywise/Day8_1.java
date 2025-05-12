package probleslovingdaywise;

import java.util.Scanner;

public class Day8_1 {
	/**
	 * Day 8: Java Practice Tasks
	 * 
	 * Question 1: Print Palindrome Numbers from 1 to N
	 * 
	 * Problem Statement: Write a Java program to accept a number N and print all
	 * palindrome numbers between 1 and N.
	 * 
	 * Explanation: A palindrome number is a number that reads the same backward as
	 * forward (e.g., 121, 44, 7).
	 * 
	 * Sample Input: Enter number: 150
	 * 
	 * Sample Output: Palindrome numbers between 1 and 150: 1 2 3 4 5 6 7 8 9 11 22
	 * 33 44 55 66 77 88 99 101 111 121 131 141
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			if(isPalindrome(i)) {
				System.out.print(i+" ");
			}
		}
	}

	public static boolean isPalindrome(int n) {
		int n1=n;
 		 int rev=0;
		 while(n>0) {
			 int digit=n%10;
			 rev=digit+rev*10;
			 n=n/10;
		 }
		if(rev==n1)return true;
 		return false;
	}
}
