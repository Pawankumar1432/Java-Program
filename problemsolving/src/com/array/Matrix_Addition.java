package com.array;

public class Matrix_Addition {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 5 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 1, 2, 3 } };
		/**
		 * 
		 * 
		 * find the sum of diagonal elements after addition c[0][0]=1*1+2*4+3*1=1+8+3=12
		 * c[0][1]=1*2+2*5+3*2=2+10+6=18
		 */
		if (a.length == b.length && a[0].length == b[0].length) {
			int[][] result = new int[a.length][a.length];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					result[i][j] = a[i][j] + b[i][j];
				}
			}
			System.out.println("Matrix Addition : ");
			print(result);
			diagonal_Sum(result);
			diagonal_Sum_Right(result);
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					result[i][j] = a[i][j] - b[i][j];
				}
			}
//		System.out.println("Matrix Substraction : ");
//		print(result);
//		System.out.println("Matrix  Multiplication : ");
//		matrix_Mult(a, b);

		} else {
			System.out.println("Matrix not possible");
		}
	}

	private static void diagonal_Sum_Right(int[][] r) {
		int sum = 0, j;
		for (int i = 0; i < r.length; i++) {
			j = r.length - 1 - i;
			sum += r[i][j];
		}
		
		System.out.println("Right Sum : " + sum);
	}

	private static void print(int[][] r) {
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < r[0].length; j++) {
				System.out.print(r[i][j] + " ");
			}
			System.out.println();
		}

	}

	static void diagonal_Sum(int[][] c) {
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum += c[i][i];
		}
		System.out.println("Left sum : " + sum);
	}

	private static void matrix_Mult(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i].length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		print(c);
	}

}
