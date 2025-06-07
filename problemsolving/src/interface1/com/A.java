package interface1.com;

public interface A {
	public static void main(String[] args) {
		System.out.println("Hello");
		display();
	}
	
	static int count=0;
	 static void display() {
		 String []a= {"a"};
		 if(count==2) {
			 main(a);
			 
		 }
		 
		 
	 }

}
