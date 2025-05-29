package interview_codingquestions;

import java.util.Scanner;

public class GCD_LCM {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1");
		int a = sc.nextInt();
		System.out.println("ENter the number2");
	    int b=sc.nextInt();
	    sc.close();
	    int gcd=1;
	    int g=Math.max(a, b);
	    for(int i=g;i>=1;i--) {
	    	if(a%i==0&&b%i==0) {
	    		System.out.println(i);
	    		gcd=i;
	    		break;
	    	}
	    }
	    
	    int c=0;
	    int lcm= (a*b)/gcd;
	    for(int i=2;i<Math.max(a,b);i++) {
	    	if(a%i==0&&b%i==0) {
	    		System.out.println(i);
	    		c=1;
	    		break;
	    	}
//	    	else {
//	    		if(i==Math.max(a, b)-1) {
//	    			System.out.println(a*b);break;
//	    		}
//	    		
//	    	}
	    }
	   if(c==0)System.out.println(a*b);
	   
	   System.out.println(lcm);
	     
	}

}
