package interview_codingquestions;

import java.util.Arrays;

public class PrefixSum {
public static void main(String[] args) {
	int arr[] = {10, 20, 10, 5, 15};
	int []prefix=new int[arr.length];
	prefix[0]=arr[0];
	for(int i=1;i<arr.length;i++) {
		prefix[i]=prefix[i-1]+arr[i];
	}
	System.out.println(Arrays.toString(arr));

	System.out.println(Arrays.toString(prefix));
}
}
