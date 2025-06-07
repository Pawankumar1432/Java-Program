package interview_codingquestions;
import java.util.function.Consumer;
import java.util.Arrays;

public class Int1 {
public static void main(String[] args) {
	Integer a[]= {21,34,41,59};
//	Comparable<Integer>a1=new Comparable<Integer>() {
//		@Override
//		public int compareTo(Integer o) {
//            
//			return 0;
//		}
//	};
	Arrays.sort(a,(o1,o2)->o1%10-o2%10);
	System.out.println(Arrays.toString(a));
	
}
}
