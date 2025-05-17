package com.array;

public class EvenNumber {
	public static void main(String[] args) {
		int[]a= {10,2,3,4,5,6,22};
		 
		int even_Sum=0,odd_Sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
				even_Sum+=a[i];
			}else {
				odd_Sum+=a[i];
			}
		}
		System.out.println("Even Sum : "+even_Sum+"\nOdd_Sum: "+odd_Sum);
		
		
		
		int odd_Index=0;
		for(int i=0;i<a.length;i++) {
		 if(i%2!=0) {
			 odd_Index+=a[i];
			 System.out.print(i+" index : "+a[i]+" ");
		 }
		}
		System.out.println("Sum of Odd index values sum : "+odd_Index);
		
		
	}

}
