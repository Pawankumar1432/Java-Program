package problemsolving;

public class SwappingWithoutTemp {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        // Before swapping
        System.out.println("------ Before Swapping -------");
        System.out.println("a value: " + a);
        System.out.println("b value: " + b);

        // Swapping logic without temp
        a = a + b;
        b = a - b;
        a = a - b;

        // After swapping
        System.out.println("------ After Swapping -------");
        System.out.println("a value: " + a);
        System.out.println("b value: " + b);
    }
}
