package examjava10_6_2025;

import java.util.Arrays;

public class ShiftZeroes {
	public static void main(String[] args) {
		/**
		 * Q1: Transfer All Zero Elements to the End (Preserve Order) Problem Statement:
		 * Write a Java program to shift all 0 elements of the array to the end, while
		 * maintaining the relative order of non-zero elements.
		 * 
		 * Input Example: arr = {0, 2, 0, 5, 3, 0, 4}
		 * 
		 * Expected Output: [2, 5, 3, 4, 0, 0, 0]
		 * 
		 * Concept Tested:
		 * 
		 * Array manipulation Two-pointer approach Explanation: Use a pointer to track
		 * position for non-zero elements, and fill remaining with zeros
		 */
		int a[]={0, 2, 0, 5, 3, 0, 4};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				int temp=a[i];
				for(int j=i;j<a.length-1;j++) {
					
					a[j]=a[j+1];
				}
				a[a.length-1]=temp;
			   
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
