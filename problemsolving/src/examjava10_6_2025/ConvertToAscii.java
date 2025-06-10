package examjava10_6_2025;

import java.util.Arrays;

public class ConvertToAscii {
	/**
	 * Q2: Convert String to ASCII Array Problem Statement: Write a Java program
	 * that accepts a string and converts each character into its ASCII equivalent.
	 * Store the result in an integer array.
	 * 
	 * Input Example: String input = "ABcd"
	 * 
	 * Expected Output: [65, 66, 99, 100]
	 * 
	 * Concept Tested:
	 * 
	 * Type casting String and character array traversal Explanation: Traverse the
	 * string, cast each char to int, and store in array.
	 */
	public static void main(String[] args) {
		String input = "ABcd";
		int a[]=new int[input.length()];
		for(int i=0;i<input.length();i++) {
			a[i]=input.charAt(i);
		}
		System.out.println(Arrays.toString(a));
	}

}
