package problemsolving;
import java.util.Scanner;

public class CharacterTypeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Take input from user
		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);

		// Check using ASCII values
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("The character is an Uppercase Letter.");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("The character is a Lowercase Letter.");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("The character is a Digit.");
		} else {
			System.out.println("The character is a Special Character.");
		}

		sc.close();
	}
}