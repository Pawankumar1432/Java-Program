package examjava10_6_2025;

import java.util.Arrays;

public class Transpose {
	/**
	 * Transpose of a Matrix Problem Statement: Write a Java program to compute the
	 * transpose of a 2D matrix (MxN). Transpose means converting rows into columns.
	 * 
	 * Input Example:
	 * 1 2 3 4 5 6 
	 * Expected Output:
	 * 1 4 2 5 3 6 
	 * Concept Tested:
	 * 2D arrays Index swapping: transpose[i][j] = original[j][i] 
	 * Explanation:
	 * Create a new matrix of size NxM, swap rows and columns.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]=new int[a[0].length][a.length];
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<a.length;j++) {
               b[i][j]=a[j][i];
			}
			
		}
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a.length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println( );
	}
}
