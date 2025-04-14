package problemsolving;

public class SumOfOddNumbers {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 50; i += 2) {
			sum += i;
		}

		System.out.println("Sum of odd numbers from 1 to 50 is: " + sum);
		
//		int sum = 0;
//		
//		for (int i = 1; i <= 50; i++) {
//		    if (i % 2 != 0) {
//		        sum += i;
//		    }
//		}
//		
//		System.out.println("Sum of odd numbers from 1 to 50 is: " + sum);

	}
}
