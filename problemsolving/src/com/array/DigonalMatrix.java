package com.array;

import java.util.Arrays;

public class DigonalMatrix {
	/**
	 * 
	 * check diagonal matrix or not 
	 * check scalar matrix a[0][0]
	 * unit matrix diagonal always 1 
	 */
	public static void main(String[] args) {
 int [][]a=new int[4][4];
 
 for(int i=0;i<a.length;i++) {
	 for(int j=0;j<a.length;j++) {
		 if(i==j) {
			 a[i][j]=i+j;
		 }
	 }
 }
 for(int i=0;i<a.length;i++) {
	 System.out.println(Arrays.toString(a[i]));
 }
	boolean status=statuscheckDiagonalMatrix(a);
 if(status) {
	 System.out.println("Yes it is a diagonal matrix");
 }else {
	 System.out.println("Not a diagonal Matrix");
 }
	}

	private static boolean statuscheckDiagonalMatrix(int[][] a) {
		 
		for(int i=0;i<a.length;) {
			for(int j=0;j<a[0].length;j++) {
				if(i!=j &&a[i][j]!=0) { 
				 return false;
				}
			}
			return true;
		}
		return false;
		
		
	}
	

}
