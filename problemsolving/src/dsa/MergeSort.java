package dsa;

import java.util.Arrays;

public class MergeSort {
	static int[] MergeOfArrays(int []a,int []b )
	{
		int i=0,j=0,k=0;
	    int[] result=new int[a.length+b.length];
	    
	    while(i<a.length&&j<b.length) {
	    	if(a[i]<b[j]) {
	    		result[k++]=a[i];
	    		i++;
	    	}else {
	    		result[k++]=b[j];
	    		j++;
	    	}
	    }
	    while(i<a.length) {
	    	result[k++]=a[i++];
	    }
	    while(j<b.length) {
	    	result[k++]=b[j++];
	    }
		
	return result;	
	}
	public static void main(String[] args) {
		int[]a= {1,3,5,7,9};
		int[]b= {2,4,6,8,10,11};
	
		int i=0,j=0,k=0;
	    int[] result=new int[a.length+b.length];
	    
	    while(i<a.length&&j<b.length) {
	    	if(a[i]<b[j]) {
	    		result[k++]=a[i];
	    		i++;
	    	}else {
	    		result[k++]=b[j];
	    		j++;
	    	}
	    }
	    while(i<a.length) {
	    	result[k++]=a[i++];
	    }
	    while(j<b.length) {
	    	result[k++]=b[j++];
	    }
 
	    System.out.println(Arrays.toString(result));
	}
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
	

}
