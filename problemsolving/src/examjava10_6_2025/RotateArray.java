package examjava10_6_2025;

import java.util.Arrays;
public class RotateArray {
	/**
	 * 
	 * Rotate Array by 2 Elements (Clockwise & Anti-clockwise) Problem Statement:
	 * Write a Java program to:
	 * 
	 * Rotate array elements by 2 positions clockwise Rotate array elements by 2
	 * positions anti-clockwise Compare the two resulting arrays for equality Input
	 * Example: arr = {1, 2, 3, 4, 5}
	 * 
	 * Clockwise (Right): [4, 5, 1, 2, 3]
	 * 
	 * Anti-clockwise (Left): [3, 4, 5, 1, 2]
	 * 
	 * Concept Tested:
	 * 
	 * Array rotation using extra space or modular logic Comparing arrays
	 * Explanation: Rotate using shifting or by copying to new array. Compare using
	 * .equals() or element-wise check.
	 */
public static void main(String[] args) {
	int []arr = {1, 2, 3, 4, 5};
	int []arr1 = {1, 2, 3, 4, 5};
	//clockwise Right
	for(int i=0;i<=2;i++) {
		int first=arr[0];
		for(int j=0;j<arr.length-1;j++) {
			arr[j]=arr[j+1];
		}
		arr[arr.length-1]=first;
	}
	System.out.println(Arrays.toString(arr));
	
	//AntiClockwise Left
	
	for(int i=0;i<=2;i++) {
		int last=arr1[arr1.length-1];
		for(int j=arr1.length-1;j>0;j--) {
			arr1[j]=arr1[j-1];
		}
		arr1[0]=last;
	}
	System.out.println(Arrays.toString(arr1));
	
	int c=0;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==arr1[i]) {
			c++;
		}
	}
	if(c==arr.length) {
		
		System.out.println("Equal");	
	}else {
		System.out.println("Not Equals");
	}

}
}
