package com.array.matrix;

public class ScalarMatrix {
public static void main(String[] args) {
	int[][] a = { { 10, 0, 0 }, 
			      { 0, 10, 0 }, 
			      { 0, 10, 10 } };
	
	boolean status=true;
	 int s=a[0][0];
	 for(int i=0;i<a.length;i++) {
		 for(int j=0;j<a[0].length;j++) {
			 if(i==j) {
				 if(a[i][j]!=s) {
					 status=false;
					 break;
				 }
			 }else {
				 if(i!=j&&a[i][j]!=0)status=false;
			 }
		 }
	 }
	 if(status) {
		 System.out.println("Scalar matrix ");
	 }else {
		 System.out.println("It is not a scalar matrix");
	 }
}
}
