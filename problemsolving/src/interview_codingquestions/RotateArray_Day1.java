package interview_codingquestions;

import java.util.Scanner;

public class RotateArray_Day1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int []a= {1,2,3,4,5,6};
	int numberRotate=2;
	//Naive Approach  Time complexity (n*d)
//	for(int i=0;i<numberRotate;i++) {
//		int first=a[0];
//		for(int j=0;j<a.length;i++) {
//			a[j]=a[j+1];
//		}
//		a[a.length-1]=first;
//	}
//	
	//Better Way Approach
	int []temp=new int[a.length];
	numberRotate%=a.length;
	for(int i=0;i<a.length-numberRotate;i++) {
		temp[i]=a[numberRotate+i];
	}
	for(int i=0;i<numberRotate;i++) {
		temp[a.length-numberRotate+i]=a[i];
	}
	
	for(int i=0;i<a.length;i++) {
		a[i]=temp[i];
		System.out.print(a[i]+" ");
	}
	
	}

}
