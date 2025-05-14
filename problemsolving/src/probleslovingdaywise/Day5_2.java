package probleslovingdaywise;

import java.util.Scanner;

public class Day5_2 {
	/*
	 * Question 2: Find Numbers Having at Least One Even Digit
	 * 
	 * Problem Statement: Write a Java program to find and display all numbers
	 * between two numbers that have at least one even digit.
	 * 
	 * Example: 123 → digits are 1, 2, 3 → 2 is even → valid. Example: 579 → digits
	 * are 5, 7, 9 → no even digits → not valid.
	 * 
	 * Sample Input: Enter start: 20 Enter end: 35
	 * Sample Output: 20, 21, 22, 23, 24, 25, 26, 27, 28, 30, 31, 32, 34
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number : ");
		int start = sc.nextInt();
		System.out.println("Enter the end number : ");
		int end = sc.nextInt();
		sc.close();
		for (int i = start; i < end; i++) {
			if (isEvenNumber(i)) {
				if (i != end - 1)
					System.out.print(i + ",");
				else
					System.out.print(i);
			}

		}
	}

	private static boolean isEvenNumber(int i) {
		int evenCount = 0;
		while (i > 0) {
			int digit = i % 10;
			if (digit % 2 == 0)
				evenCount++;
			i /= 10;
		}
		if (evenCount > 0)
			return true;

		return false;
	}
}
