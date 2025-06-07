package probleslovingdaywise;

public class Day12 {
	
	public static void main(String[] args) {
		for(int i=2;i<200;i++) {
			if(isPrime(i)) {
				int r=i+2;
				 if(isPrime(r)) {
					 System.out.println("("+i+", "+r+")"); 
				 }
			}
		}	
		
	}
	private static boolean isPrime(int i) {
		 for(int i1=2;i1<=Math.sqrt(i);i1++) {
			 if(i%i1==0)return false;
		 }
		return true;
	}

}
