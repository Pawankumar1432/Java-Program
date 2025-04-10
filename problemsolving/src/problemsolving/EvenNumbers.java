package problemsolving;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println(n+" is a even number");
		}
		else {
			System.out.println(n+" is a odd number");
		}
		sc.close();
		
	}

}
