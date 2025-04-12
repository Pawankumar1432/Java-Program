package problemsolving;

public class ReverseNumberRange {
	
	public static int rev(int i) {
     int rev=0;
     while(i>0) {
    	 int rem=i%10;
    	 rev=rev*10+rem;
    	 i/=10;
     }
		return rev;
	}
	public static void main(String[] args) {
		
		
		//1
		for(int i=20;i>=1;i--) {
			System.out.print(i+" - "+rev(i));
			System.out.println();
			
		}
		
		
		

		
		
		
		//2
//		for(int i=20;i>=1;i++) {
//			int n1=i;
//			int rev=0;
//			while(n1>0) {
//				int rem=n1%10;
//				rev=rev*10+rem;
//				n1/=10;
//			}
//			System.out.println(rev);
//		}
		
		//3
//		int n=20;
//		
//		while(n>=1) {
//			int rev=0;
// 			int n1=n;
//			while(n1>0) {
//				int rem=n1%10;
//				rev=rev*10+rem;
//				n1/=10;
//			}
//			if(n%10==0) {
//				System.out.println(0+n+" - "+rev);
//			}
//		
//			System.out.println(n+" - "+rev);
//			n--;
//			
//		}
	}

	

}
