package probleslovingdaywise;

import java.util.Scanner;

public class Day4_1 {
	public static void main(String[] args) {
		/*
		 * Question 1: Print Non-Fibonacci Numbers Problem Statement: Write a Java
		 * program to print the first n non-Fibonacci numbers. A non-Fibonacci number is
		 * a positive integer that is not a Fibonacci number. Sample Input: Enter the
		 * count: 20 Sample Output: 4, 6, 7, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a count : ");
		int n = sc.nextInt();
		int a = 1;
		int b = 2;

		int count = 0;
		while (count < n) {
			int c = a + b;
			int c1 = 1;
			for (int i = b + 1; i < c; i++) {
				if (i > 20) {
					c1 = 0;
					break;
				}
				System.out.print(i + " ");
				count++;
			}
			a = b;
			b = c;
			if (c1 == 0)
				break;
		}

	}

}
