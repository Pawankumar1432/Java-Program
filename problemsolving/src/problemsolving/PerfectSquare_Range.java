package problemsolving;

public class PerfectSquare_Range {

	  static void isPerfect(int n) {
		 int sum=0;
		 for(int i=1;i<n;i++) {//6/1=0 6/2=0 6/3=0 
			 if(n%i==0) {     // sum=0+1+2+3
				 sum+=i;
			 }
		 }
 		 if(sum==n) {
			 System.out.println(n+" == "+sum+"\nYes Perfect Number");
		 }else {
			 System.out.println(n+" != "+sum+"\nNot a Perfect Number");
		 }
 		
	}
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter number ");
		//int n=sc.nextInt();
		for(int i=20;i<=40;i++) {
			isPerfect(i);
		}
		
		
		
		
		
		
		
		
		
	
		
		//perfect Squar 
//		for(int i=1;i<n;i++) {
//			if(i*i==n) {
//				System.out.println(i);break;
//			}
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
//		//6    1 2 3 6  sum= 1+2+3 ==6
//		int n=6;
//		int sum=0;
//		for(int i=1;i<n;i++) {
//			if(n%i==0) {
//				sum+=i;
//			}
//		}
//		
//		if(sum==n) {
//			System.out.println("Yes");
//		}else
//		System.out.println();
	}



}
