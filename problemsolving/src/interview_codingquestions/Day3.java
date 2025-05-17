package interview_codingquestions;

public class Day3 {
	public static void main(String[] args) {
//		int a[]= {10, 3, 15, 6, 20};
		int a[]= {1, -4, 3, -6, 7, 0};
		int max1=0,max2=0,max3=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max3=max2;
				max2=max1;
				max1=a[i];
			}else if(a[i]>max2) {
				max3=max2;
				max2=a[i];	
			}else if(a[i]>max3) {
				max3=a[i];
			}
		}
		System.out.println(max1+" "+max2+" "+max3);
		
	}

}
