package probleslovingdaywise;

import java.util.Scanner;

public class Day3_2 {
	public static void main(String[] args) {
		/*
		 * Question 2: Count Even and Odd Digits
           Problem Statement:
        Write a Java program that takes an integer and counts how many even and odd digits it has.
        Sample Input 
        Enter a number: 123456
        Sample Output:
        Even digits: 3  
        Odd digits: 3*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int even=0,odd=0;
		while(n>0) {
			int digit=n%10;
			 if(digit%2==0) {
				 even++;
			 }else {
				 odd++;
			 }
			n/=10;
			
		}
		System.out.println("Even digits: "+even);
		System.out.println("odd digits: "+odd);
	}

}
