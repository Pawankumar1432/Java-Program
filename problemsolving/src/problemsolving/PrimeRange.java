package problemsolving;

public class PrimeRange {

	public static boolean isPrime(int n) {
		
		int c=0;
		for(int i=2;i<n;i++) {
			if(i%2==0) {
			c++;
			}
		}
		if(c==0)
		return true;else return false;
		 
		 
	 
	}

	public static void main(String[] args) {

		int n = 3;
		int c = 0;
		
		// System.out.println(isPrime(5));
		
		
		for(int i=2;i<n;i++) {
			if(i%2==0) {
			c++;
			}
		}
		
		if(isPrime()) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a prime");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(isPrime(3));
//		while (true) {
//
//			if (isPrime(n)==2) {
//				  c++;
// 			}
//            
//			if (c == 3) {
//				break;
//			}
//			System.out.println(n);
//
//			n++;
//			
//		}

	}

}
