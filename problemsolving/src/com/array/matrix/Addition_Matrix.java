package com.array.matrix;

public class Addition_Matrix {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 5 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 1, 2, 3 } };
		int[][] result=new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for(int j=0;j<a[0].length;j++) {
				result[i][j]=a[i][j]+b[i][j];
			}
		}
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[0].length; j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}

	}

}
