package probleslovingdaywise;

import java.util.Scanner;

public class Day6_2 {
	/*
	 * Question 2: Check if a Number is an Armstrong Number
	 * 
	 * Problem Statement: Write a Java program to accept one number from the user
	 * and check whether it is an
	 * 
	 * An Armstrong number of n digits is a number that is equal to the sum of its
	 * digits each raised to the power n. Example:
	 * 
	 * 153 → 1³ + 5³ + 3³ = 153
	 * 
	 * 370 → 3³ + 7³ + 0³ = 370
	 * 
	 * Sample Input: Enter n: 153
	 * Sample Output: 153 is an Armstrong number
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int result=isArmstrongNumber(n);
		if(n==result) {
			System.out.println(n+" is a Armstrong number.");
		}else {
			System.out.println(n+" is a not a Armstrong number.");
		}
		sc.close();
	}

	private static int isArmstrongNumber(int n) {
           int c=count(n),rev=0;;
           while(n>0) {
        	   int digit =n%10;
        	   rev=(int)Math.pow(digit,c)+rev;
        	   n/=10;
        	   
           }
		return rev;
	}

	private static int count(int n) {
        int c=0; 
		while(n>0) {
        	 c++;
        	 n/=10;
         }
		return c;
	}

}
