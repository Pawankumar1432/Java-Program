package probleslovingdaywise;

public class Day1_2 {
public static void main(String[] args) {
	
	
	/*
	 * Question 2: Fibonacci Series
	 * Problem Statement:
	 * Write a Java program to print the Fibonacci series up to the first 10 numbers.
	 * The Fibonacci sequence starts from 0 and 1, and each number is the sum of the previous two.
	 * Sample Output:
	 * Fibonacci series up to 10 numbers:  
	 * 0 1 1 2 3 5 8 13 21 34
	 * */
int a=0;
int b=1;
//int c=0;
System.out.println("Fibonacci series up to 10 numbers : ");
System.out.print(a+" ");
//for(int i=2;i<=10;i++) {
while(true) {
	int c=a+b;
	if(c<=999) {
		System.out.print(c+" ");
	}else {
		break;
	}
	a=b;
	b=c;
	
}
}
}
