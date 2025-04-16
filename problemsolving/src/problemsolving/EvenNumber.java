package problemsolving;

public class EvenNumber {
	public static void main(String[] args) {
		int i=26;
		int c=0;
		System.out.println("After 26 : Even Numbers ");
		while(true) {
//			if(i%2==0) {
//				c++;
//				System.out.println("Even number is : "+i);
//			}
			c++;

			System.out.println("Even number is : "+i);

			if(c==40) {
				break;
			}
			i+=2;
		}
		System.out.println("Count is : "+c);
		
		
	}

}
