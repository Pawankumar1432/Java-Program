package problemsolving;

public class PrimeRange {

	public static boolean isPrime(int n) {
		 
		for (int j = 2; j < n; j++) {
			if (n % j == 0) {
				return false;
			}
		}
		 
			return true;

	}

	public static void main(String[] args) {
		int i = 150;
		int c = 0;
		while (true) {
			if (isPrime(i)) {
				c++;
				System.out.print(i + " ");
			}
			if (c == 30)
				break;
			i++;
		}

	}

}
