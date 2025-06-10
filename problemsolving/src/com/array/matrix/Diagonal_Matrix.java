package com.array.matrix;

public class Diagonal_Matrix {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 5 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 1, 2, 3 } };
		diagonal_Sum_Right(a);
		diagonal_Sum(a);
	}
	private static void diagonal_Sum_Right(int[][] r) {
		int sum = 0, j;
		for (int i = 0; i < r.length; i++) {
			j = r.length - 1 - i;
			sum += r[i][j];
		}
		
		System.out.println("Right Sum : " + sum);
	}

	 

	static void diagonal_Sum(int[][] c) {
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum += c[i][i];
		}
		System.out.println("Left sum : " + sum);
	}
}
