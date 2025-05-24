package Exam;
class A {
    int x = 5;
    A() {
        printValue();
    }
    void printValue() {
        System.out.println("Value from A: " + x);
    }
}
class B extends A {
    int x = 10;
    B(){
    	super();
    }
    void printValue() {
        System.out.println("Value from B: " + x);
    }
}
public class e {
    public static void main(String[] args) {
        A obj = new B();
    }
}
