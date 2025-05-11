package problemsolving;

public class EvenOrOdd {
    public static void evenOrOdd(int a) {
        if (a % 2 == 0) {  // Check for even numbers
            System.out.println(a + " is even number");
        } else {
            System.out.println(a + " is odd number ");
        }
    }
    
    public static void main(String[] args) {
        evenOrOdd(24); // even
        evenOrOdd(37); // odd
        evenOrOdd(12); // even
        evenOrOdd(5);  // odd
        evenOrOdd(0);  // even
        evenOrOdd(-1); // odd   
    }
}
