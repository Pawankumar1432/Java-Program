package dsa;

import java.util.Arrays;

public class Task2 {
	
	private static boolean isPalindrome(int n) {
		 int rev=0;
		 int n1=n;
		 while(n>0) {
			 int digit=n%10;
			 rev=rev*10+digit;
			 n/=10;
		 }
		 if(rev==n1) {			 
			 return true;
		 }
		return false;
	}
	public static void main(String[] args) {
		int []a= {232,456,111,989,363};
		boolean []b=new boolean[a.length];
		
		for(int i=0;i<a.length;i++) {
			if(isPalindrome(a[i])) {
				b[i]=true;
			}else {
				b[i]=false;
			}
		}
		System.out.println(Arrays.toString(b));
		
	}

	

}
