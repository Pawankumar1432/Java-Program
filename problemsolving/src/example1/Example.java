package example1;

 abstract class Ex {
 abstract void display() ;
}
public class Example extends Ex{
public static void main(String[] args) {
	Example a=new Example();
		a.display();
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
		
	}
	
}

