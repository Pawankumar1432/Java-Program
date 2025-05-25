package dsa;

public class LinearSearch {
	public static void main(String[] args) {
		int a[]= {1,3,1,4,6,7,8,9};
		boolean find=false;
		int target=4;
		for(int i=0;i<a.length;i++) {
			if(a[i]==target) {
				find=true;
			}
		}
		if(find) {
			System.out.println("Element is found");
		}
		else {
			System.out.println("Element not found");
		}
	}

}
