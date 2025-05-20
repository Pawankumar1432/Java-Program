package com.array;

import java.util.Arrays;

public class Problem2 {
	public static void main(String[] args) {
		int []a= {4,8,16,24,13,9,7,3,13};
		String []result	=new String[a.length];
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				result[i]="even";
			}else {
				result[i]="odd";
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(result));
      
}
}
