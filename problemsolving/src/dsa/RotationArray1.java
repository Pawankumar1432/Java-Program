package dsa;

import java.util.Arrays;

public class RotationArray1 {
	/**
	 * Test case-1
	 * [22,33,44,55,66,77,88]
	 * Clock wise- rotation: 77,88,22,33,44,55,66
	 * Anti-clock-wise: 44,55,66,77,88,22, 33
	 * check two arrays are equal or not 
	 * Test case-2
	 * 1,1,1,1,1,1,1
	 * 
	 */
	public static void main(String[] args) {
		//int[]a= {22,33,44,55,66,77,88};
		int []a1={22,33,44,55,66,77,88};
		int []b1={22,33,44,55,66,77,88};
		for(int i=0;i<2;i++) {
			
			int first=a1[0];
			for(int j=0;j<a1.length-1;j++) {
				a1[j]=a1[j+1];
			}
			a1[a1.length-1]=first;	
			 
		}
		System.out.println(Arrays.toString(a1));
		
        for(int i=0;i<2;i++) {
			int end=b1[b1.length-1];
			 for(int j=b1.length-1;j>0;j--) {
				 b1[j]=b1[j-1];
			 }
			 b1[0]=end;
			 
		}
		System.out.println(Arrays.toString(b1));

	}

}
