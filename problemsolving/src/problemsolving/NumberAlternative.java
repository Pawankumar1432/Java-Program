package problemsolving;

public class NumberAlternative {
	public static void main(String[] args) {
		int n=9;
//		for(int i=9;i>=1;i--) {
//			System.out.print(i+" ");
//			 if(n!=5)
//			System.out.print(n+" ");
//			n++;
//		}
		int c=0;
		for(int i=n;i>=1;i--) {
			if(i==5&&c==0) {
				System.out.print(i+" ");c=1;
			}else
				System.out.print(i+" "+(n-(i-1))+" ");
		}
	}

}
