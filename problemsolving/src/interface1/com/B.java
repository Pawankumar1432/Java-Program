package interface1.com;

public class B {
	static int count=0;
	public static void main(String[] args) {
		System.out.println("Hello "+ count);
		
		count++;
		if(count==1) {
			display();	
		}
		System.out.println(count);
	}
	
	
	 static int display() {
		 String []a= {"a"};
		 if(count==2) {
			 return 0;
		 }else {
			 main(new String []{});
			 System.out.println("hi");
		 }
		 count++;
		 
		return 1;
	 }
}
