package probleslovingdaywise;

import java.util.Scanner;

public class Day4_2 {
	public static void main(String[] args) {
		/*
		 * Question 2: Find Twin Prime Numbers in a Range

       Problem Statement:
       Write a Java program to find and display twin prime pairs in a given range.

        Twin Primes are pairs of prime numbers that differ by 2 (e.g., 3 and 5, 11 and 13, etc.)

       Sample Input:  
       Enter start: 1  
       Enter end: 30

Sample Output:  
(3, 5)  
(5, 7)  
(11, 13)  
(17, 19)  
(29, 31)
*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start : ");
		int start=sc.nextInt();
		System.out.println("Enter end : ");
		int end=sc.nextInt();
		int p1=0,p2=0;
		for(int i=start;i<end;i++) {
			if(isPrime(i))p1=i;
			for(int j=i+1;j<end;j++) {
				if(isPrime(j))p2=j;
				System.out.print(p2+" ");
			}
			 
			 
		        
		}
		
	}

	private static boolean isPrime(int n) {
		if(n==1)return false;
       for(int i=2;i<n;i++) {
    	   if(n%i==0) {
    		   return false;
    	   }
       }
		return true;
	}

}
