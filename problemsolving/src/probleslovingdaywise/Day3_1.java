package probleslovingdaywise;

import java.util.Scanner;

public class Day3_1 {
	public static void main(String[] args) {
		/*
		 * Question 1: Find the Largest Digit in a Number
		 * Problem Statement:  
		 * Write a Java program to find the largest digit in a given number.
		 * Sample Input:  
            Enter a number: 5729
            Sample Output:  
            Largest digit: 9
		 * */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int max=n%10;
		while(n>0) {
			int digit=n%10;
			if(max<digit) {
				max=digit;
			}
			n/=10;
			
		}
		System.out.println("Largest digit : "+max);
	}

}
