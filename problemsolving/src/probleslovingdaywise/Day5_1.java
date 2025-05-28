package probleslovingdaywise;

import java.util.Scanner;

public class Day5_1 {
	/*
	 * Day 5: Java Practice Tasks
	 * 
	 * Question 1: Find Numbers with Sum of Digits Prime
	 * 
	 * Problem Statement: Write a Java program to find and print all numbers between
	 * 2 and n such that the sum of their digits is a prime number.
	 * 
	 * Example: Number = 23 → 2 + 3 = 5 → 5 is prime → 23 is valid.
	 * 
	 * Sample Input: Enter n: 50
	 * 
	 * Sample Output: 2, 3, 5, 7, 11, 12, 14, 16, 20, 21, 23, 25, 30, 32, 34, 41,
	 * 43, 50
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			if (isDigitSum(i)) {
				if (i != n)
					System.out.print(i + ",");
				else {
					System.out.print(i);
				}
			}
		}
		sc.close();
	}

	private static boolean isDigitSum(int i) {
		int sum = 0;
		while (i > 0) {
			int d = i % 10;
			sum += d;
			i /= 10;
		}
		if (isPrime(sum)) {
			return true;
		}
		return false;
	}

	private static boolean isPrime(int sum) {
		if (sum == 1)
			return false;
		for (int i = 2; i < sum; i++) {
			if (sum % i == 0) {
				return false;
			}
		}

		return true;
	}

}
