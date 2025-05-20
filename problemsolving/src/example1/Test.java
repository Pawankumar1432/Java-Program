package example1;

 
public interface Test {
	 void print();
     static void method1() {
        System.out.println("method1");
    }

  default void method2() {
        System.out.println("method2");
    }

        private void method3() {
        System.out.println("method3");
    }

    public abstract void method4();
}