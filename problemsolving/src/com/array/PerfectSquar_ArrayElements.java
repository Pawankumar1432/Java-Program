package com.array;

import java.util.Arrays;

public class PerfectSquar_ArrayElements {
	public static boolean isPerfectSquare(int number) {
 	 
		for(int i=1;i<number;i++) {
			if(i*i==number) {
			 return true;
			}
		}
	
		return false;
	}
	public static void main(String[] args) {
	int []a= {8,16,64,96,36,121,196,256};
	
	//Perfect square means sum of factors expect that number  equals to fgive number 
	int pcount=0;
	for (int i = 0; i < a.length; i++) {
		if(isPerfectSquare(a[i])) {
			pcount++;
			
		}
	}
	System.out.println(pcount);
	int[] result=new int[pcount];
	int j=0;
	for(int i=0;i<a.length;i++) {
		if(isPerfectSquare(a[i])) {
			result[j++]=a[i];
		}
	}
	System.out.println(Arrays.toString(result));
	
	
	
}


}
