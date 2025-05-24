package Exam;

 class Parent {
	 Parent(){
		 display();
	 }
	 int x=10;
	void display() {
		System.out.println("Parent"+x);
	}
}
class Child extends Parent{
	int x=30;
	void display() {
		System.out.println("Child"+x);
	}
}
public class Q2{
	public static void main(String[] args) {
		Child c=new Child();
		c.display();
		Parent p=new Parent();
		p.display();
		Parent obj1=new Child();
		obj1.display();
	}
}
