package problemsolving;

import java.util.Scanner;

public class FactorsOfGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					System.out.print(i +" ");
				}
			}
		} else {
			System.out.println("Invalid number");
		}

		sc.close();
	}
}
