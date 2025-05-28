package probleslovingdaywise;

import java.util.Scanner;

public class Day10_2 {
	// Sunny number is next number is perfect square then it is sunny number

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();

		if (isSunnyNumber(n+1)) {
			System.out.println(n + " is a sunny number");
		} else {
			System.out.println(n + " is not a sunny number");
		}
		sc.close();
	}

	private static boolean isSunnyNumber(int n) {
        for(int i=1;i<n;i++) {
        	if(i*i==n)return true;
        }
		return false;
	}
}
