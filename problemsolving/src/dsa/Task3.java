package dsa;

public class Task3 {
	public static void main(String[] args) {
	   int a[]= {23,45,67};
	   System.out.print("[");
	   for(int i=0;i<a.length;i++) {
		   if(i==a.length-1)
		   System.out.print(a[i]+"]");
		   else {
			   System.out.print(a[i]+",");
		   }
	   }
	}

}
