package probleslovingdaywise;

import java.util.Scanner;

public class Day2_1{
	public static void main(String[] args) {
		/*
		 * Question 1: Factorial of a Number
		 * Problem Statement:
		 * Write a Java program to calculate the factorial of a given number.  
		 * Factorial of n is the product of all positive integers less than or equal to n.*
		 * Sample Input:  
		 * Enter a number: 5
		 * Sample Output:  
		 * Factorial of 5 is: 120
         */
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+n +" is : "+fact);
		sc.close();
	}

}
