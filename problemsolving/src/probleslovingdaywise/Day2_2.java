package probleslovingdaywise;

import java.util.Scanner;

public class Day2_2 {
public static void main(String[] args) {
	/*
	 * 
	 * Question 2: Reverse a Number
	 * Problem Statement:
	 * Write a Java program to reverse the digits of a given number.
	 * Sample Input:  
	 * Enter a number: 12345
	 * Sample Output:  
	 * Reversed number: 54321*/
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number : ");
	int n=sc.nextInt();
	int rev=0;
	while(n>0) {
		int digit=n%10;
		rev=rev*10+digit;
		n/=10;
	}
	System.out.println("Reversed number:"+rev);
}
}
