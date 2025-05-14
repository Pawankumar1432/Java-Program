package interview_codingquestions;

import java.util.Arrays;

public class SecondLargestElement_Day2 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,15,46};
	int largest=-1;
	int second_largest=-1;
	//Naive Approach
	Arrays.sort(a);
	System.out.println(a[a.length-2]);
    //better way
	for(int i=0;i<a.length;i++) {
		if(a[i]>largest) {
			
			largest=a[i];
		}
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]>second_largest&& a[i]!=largest) {
			second_largest=a[i];
		}
	}
	System.out.println(second_largest);
}
}
