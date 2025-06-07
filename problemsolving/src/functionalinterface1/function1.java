package functionalinterface1;

 

@FunctionalInterface
interface A{
	int[] display(int []a);
}
public class function1 {
public static void main(String[] args) {
	int []b= {10,20,30,40,50,60};
	A a1=(a)->{
		for(int i:a) {i+=10;
		System.out.print(i+" ");}
		return a;
	};
	System.out.println(a1.display(b));
}


/**
 * TWIN primes
 * 1)two prime difference is twin number
 *   given range of 1 to 200
 * 2)print non fib up to 100
 */











//for(int i=0;i<a.length;i++) {
//a[i]+=10;
//System.out.println(a[i]);
//}
}
