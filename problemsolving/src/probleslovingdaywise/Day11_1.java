package probleslovingdaywise;

import java.util.Scanner;

public class Day11_1 {
	/*
	 * Day 2: Java Practice Tasks
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
	 * 
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
	 * 
	 * 
	 * Sample Output: 153 is an Armstrong number
	 * 
	 * 
	 */

	static int fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if (isStrongNumber(n)) {
			System.out.println(n + " is a Strong number");
		} else {
			System.out.println(n + " is not a Strong number");

		}

		if (isArmstrong(n)) {
			System.out.println(n + " is an Armstrong number");
		} else {
			System.out.println(n + " is not an Armstrong number");
		}
		sc.close();

	}

	private static boolean isArmstrong(int n) {
		int sum = 0;
		int n1 = n;
		int count = isCount(n);
		while (n > 0) {
			int d = n % 10;
			sum += Math.pow(d, count);
			n /= 10;
		}
		if (sum == n1)
			return true;

		return false;
	}

	private static int isCount(int n) {
		int c = 0;
		while (n > 0) {
			n /= 10;
			c++;
		}
		return c;
	}

	private static boolean isStrongNumber(int n) {
		int n1 = n;
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			sum += fact(digit);
			n /= 10;
		}
		if (sum == n1)
			return true;
		return false;
	}

}
