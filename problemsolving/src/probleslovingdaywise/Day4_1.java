package probleslovingdaywise;

import java.util.Scanner;

public class Day4_1 {
	public static void main(String[] args) {
		/*Question 1: Print Non-Fibonacci Numbers
		 * Problem Statement: 
		 * Write a Java program to print the first n non-Fibonacci numbers.
		 * A non-Fibonacci number is a positive integer that is not a Fibonacci number.
		 * Sample Input:  
         Enter the count: 20
         Sample Output: 
         4, 6, 7, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20

		 * */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a count : ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=3;i<n;i++) {
			c=a+b;
			
		}
		
	}

}
