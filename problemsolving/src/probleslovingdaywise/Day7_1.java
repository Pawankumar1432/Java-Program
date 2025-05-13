package probleslovingdaywise;

import java.util.Scanner;

public class Day7_1 {

	/*
	 * Day 7: Java Practice Tasks
	 * 
	 * Question 1: Print Non-Prime Numbers from 1 to N
	 * 
	 * Problem Statement: Write a Java program to accept a number from the user and
	 * print all non-prime numbers between 1 and N.
	 * 
	 * Explanation: A non-prime number is a number greater than 1 that has more than
	 * two divisors, or is simply not a prime number. Note: 1 is also considered
	 * non-prime.
	 * 
	 * Sample Input: Enter number: 10
	 * 
	 * Sample Output: Non-prime numbers between 1 and 10: 1 4 6 8 9 10
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range N");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

	public static boolean isPrime(int n) {
      if(n==1)return true;
      for(int i=2;i<n;i++) {
    	  if(n%i==0) {
    		  return true;
    	  }
      }
		return false;
	}
}
