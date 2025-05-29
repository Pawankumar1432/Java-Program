package interview_codingquestions;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {
public static void main(String[] args) {
//	int arr[] = {10, 20, 10, 5, 15};
	int arr[]= {1, 2, 3, 4, 5};
	int []prefix=new int[arr.length];
	prefix[0]=arr[0];
	for(int i=1;i<arr.length;i++) {
		prefix[i]=prefix[i-1]+arr[i];
	}
	System.out.println(Arrays.toString(arr));

	System.out.println(Arrays.toString(prefix));
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the queries:");
	int n=sc.nextInt();
	while(n-->0) {
		System.out.println("Enter the start and end ");
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		if(start==0) {
			System.out.println(prefix[end]);
		}else
		System.out.println(prefix[end]-prefix[start-1]);
	}
	
}
}
