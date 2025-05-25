package dsa;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int a[]= {1,3,4,6,7,8,9};
		
		int target=4;
		//Arrays.sort(a);
		int low=0;
		boolean status=false;
		int high=a.length-1;
		//int mid=0;
		//System.out.println(mid);
//		for(int i=0;i<a.length-1;i++) {
//			mid=(low+high)/2;
//			if(mid==target) {
//				status=true;
//			}else if(mid>target) {
//				low=mid+1;
//			}else {
//				high=mid-1;
//			}
//		}
		 while(low<=high){
			int mid=(low+high)/2;
			if(a[mid]==target) {
				status=true;
				break;
			}else if(a[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		if(status) {
			System.out.println("found");
		}else {
			System.out.println("Not found");
		}
		
	}

}
