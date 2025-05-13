package probleslovingdaywise;

import java.util.Scanner;

public class Day7_2 {
	/**
	 * * Question 2: Check if a Number is a Sunny Number
	 * 
	 * Problem Statement: Write a Java program to check if a number is a Sunny
	 * Number.
	 * 
	 * Explanation: A number N is called a Sunny number if N + 1 is a perfect
	 * square. For example: 8 → 8 + 1 = 9 → √9 = 3 → Sunny number 10 → 10 + 1 = 11 →
	 * not a perfect square → Not Sunny
	 * Sample Input: Enter number: 8
	 * Sample Output: 8 is a Sunny number.
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range N");
		int n=sc.nextInt();
		int n1=n+1;
		boolean flag=false;
		for(int i=2;i<n1-1;i++) {
			if(n1%i==0) {
				 flag=true;
			}
			
		}
		 if(flag) {
			 System.out.print(n+" is a sunny number ");
		 }else {
			 System.out.println(n +" Not sunny number");
		 }
	    
	}
	

}
