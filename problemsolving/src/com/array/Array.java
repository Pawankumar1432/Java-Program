package com.array;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		//int n = sc.nextInt();
		int n=3;
		int[] a = new int[sc.nextInt()];
		System.out.println("Enter the Elements in array  ");
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the index " + i + " Element  : ");
			a[i] = sc.nextInt();
		}
		System.out.println("Array Elements : ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}

}
