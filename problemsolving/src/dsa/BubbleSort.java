package dsa;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int a[]= {1,3,2,4,16,7,8,9};
		System.out.println("Befor Sort :"+Arrays.toString(a));

		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(
				"After Sort :"+Arrays.toString(a));
		
	}

}
