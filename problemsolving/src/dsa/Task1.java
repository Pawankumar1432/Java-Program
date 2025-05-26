package dsa;

public class Task1 {
	static int recursion(int n) {
		 
		if(n<=20) {
			System.out.print(n+" ");
			 return recursion(n+1);
		}  
		return 0;
		
	}
public static void main(String[] args) {
	recursion(1);
	
}
}
