package examjava10_6_2025;

public class Second_Max {
	/**
	 * Q4: Find Second Largest Element Without Sorting Problem Statement: Write a
	 * Java program to find the second largest element in an array without using any
	 * sorting technique.
	 * 
	 * Input Example: arr = {10, 25, 30, 5, 40, 30}
	 * 
	 * Expected Output: Second Largest = 30
	 * 
	 * Concept Tested:
	 * 
	 * Traversal Conditional tracking with two variables (max and secondMax)
	 * Explanation: Track max and second max values in a single pass.
	 */

	public static void main(String[] args) {
		int a[]={10, 25, 30, 50, 40, 30};
		int max=a[0];
		int secondMax=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				secondMax=max;
				max=a[i];
			}else if(a[i]>secondMax&&a[i]!=max) {
				secondMax=a[i];
			}
		}
//		System.out.println(max+" "+secondMax);
		System.out.println("Maximum : "+max+"Second Maximu "+secondMax);

		
	}
}
