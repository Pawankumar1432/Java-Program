package com.array;

import java.util.Arrays;

public class Prime {

	public static boolean isPrime(int number) {

		boolean isPrime = true;

		if (number <= 1) {
			isPrime = false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
				//break;
			}

		}

		return isPrime;
	}

	public static void main(String[] args) {
		int[] a = { 23, 11, 17, 19, 22, 48, 99, 13 };
		int c=0;
		for(int i=0;i<a.length;i++) {
			
			if(isPrime(a[i])) {
				c++;
			}
			
		}
		System.out.println(c);
		
		
		int []b=new int[c];
		int j=0;
		for (int i = 0; i < a.length; i++) {
			if(isPrime(a[i])) {
				b[j]=a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(b));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		int pcount = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (isPrime(a[i])) {
//				pcount++;
//			}
//		}
//		int size = pcount;
//		System.out.println("Prime numbers Count : " + size);
//		int []b=new int[size];
// 		int j=0;
//		for (int i = 0; i < a.length; i++) {
//			if(isPrime(a[i])) {
//				b[j]=a[i];
//				j++;
//			}
//		}
// 		
//		System.out.println(Arrays.toString(b));
//		
//		
//		for (int i = 0; i < b.length; i++) {
//			b[i]=b[i]+b[i];
//		}		
	}

}
