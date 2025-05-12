package probleslovingdaywise;

import java.util.Scanner;

public class Day8_2 {
	/**
	 * 
	 * Question 2: Check if a Number is a Neon Number
	 * 
	 * Problem Statement: Write a Java program to check if a number is a Neon
	 * number.
	 * 
	 * Explanation: A number is a Neon number if the sum of digits of its square is
	 * equal to the number itself. For example:
	 * 
	 * 9 → 9² = 81 → 8 + 1 = 9 → Neon number 7 → 7² = 49 → 4 + 9 = 13 → Not Neon
	 * 
	 * Sample Input: Enter number: 9
	 * 
	 * Sample Output: 9 is a Neon number.
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int n=sc.nextInt();
		int pow=(int) Math.pow(n, 2);
		int sum=0;
		while(pow>0) {
			int digit=pow%10;
			sum+=digit;
			pow/=10;
		}
		if(sum==n) {
			System.out.println(n+" is a Neon number");
		}else {
			System.out.println(n+" Not a Neon number");
		}
	}
}
