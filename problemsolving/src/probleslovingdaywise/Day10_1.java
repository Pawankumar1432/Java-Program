package probleslovingdaywise;

import java.util.Scanner;

public class Day10_1 {
	// Neon number is sum of digits it square of given number is equal to number
	// then is true

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if (isNeonNumber(n)) {
			System.out.println(n + " is a neon number");
		} else {
			System.out.println(n + " is not a neon number");
		}
		sc.close();
		
		

	}

	private static boolean isNeonNumber(int n) {
		int square = n * n;
		int sum = 0;
		while (square > 0) {
			int digit = square % 10;
			sum += digit;
			square /= 10;
		}

		if (n == sum)
			return true;

		return false;
	}

}
