package problemsolving;

public class SwappingWithTemp {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        // Before swapping
        System.out.println("------ Before Swapping -------");
        System.out.println("a value: " + a);
        System.out.println("b value: " + b);

        // Swapping logic
        int temp = a;
        a = b;
        b = temp;

        // After swapping
        System.out.println("------ After Swapping -------");
        System.out.println("a value: " + a);
        System.out.println("b value: " + b);
    }
}
