package problemsolving;

import java.util.Scanner;

public class PerfectNumberCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		int sum = 0;

		// Find proper divisors and add them
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}

		// Check if sum equals the number
		if (sum == number) {
			System.out.println(number + " is a Perfect Number.");
		} else {
			System.out.println(number + " is NOT a Perfect Number.");
		}
	}
}
