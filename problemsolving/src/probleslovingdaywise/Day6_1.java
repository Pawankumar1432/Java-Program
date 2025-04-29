package probleslovingdaywise;

import java.util.Scanner;

public class Day6_1 {
	/*
	 * Day 6: Java Practice Tasks
	 * 
	 * Question 1: Check if a Number is a Strong Number
	 * 
	 * Problem Statement: Write a Java program to accept one number from the user
	 * and check whether it is a Strong number or not.
	 * 
	 * A Strong number is a number where the sum of the factorial of each digit
	 * equals the number itself. Example:
	 * 
	 * 145 → 1! + 4! + 5! = 1 + 24 + 120 = 145 → 145 is a Strong number.
	 * 
	 * Sample Input: Enter number: 145
	 * 
	 * Sample Output: 145 is a Strong number.
	 */
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n=sc.nextInt();
	int result=isStrongNumber(n);
	if(n==result) {
		System.out.println(n+" is a Strong number.");
	}else {
		System.out.println(n+" is a not a Strong number.");
	}
	sc.close();
}

	private static int isStrongNumber(int n) {
         int sum=0;
         while(n>0) {
        	 int digit=n%10;
        	 sum+=isFact(digit);
        	 n/=10;
         }
 		return sum;
	}

	private static int isFact(int digit) {
		int fact=1;
		for(int i=2;i<=digit;i++) {
			fact*=i;
		}
  		return fact;
	}
}
