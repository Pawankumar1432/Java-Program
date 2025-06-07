package interview_codingquestions;
 

public class Find_All_Perimutations {
public static void main(String[] args) {
	String str="abc";
 	 
		per(str,""); 
 
	}
	

private static void per(String str, String prefix) {

	if(str.length()==0) {
		System.out.println(prefix);
	}else{
		for(int i=0;i<str.length();i++) {
			String rem=str.substring(0,i)+str.substring(i+1);
			per(rem,prefix+str.charAt(i));
		}
		
	}
	
}
}
