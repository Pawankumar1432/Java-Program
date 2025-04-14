package problemsolving;

import java.util.Scanner;

public class TriangleTypeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side A: ");
        int a = sc.nextInt();

        System.out.print("Enter side B: ");
        int b = sc.nextInt();

        System.out.print("Enter side C: ");
        int c = sc.nextInt();

        // First: Check for a valid triangle
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Triangle ");

            // Now check the type
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle ");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles Triangle ");
            } else {
                System.out.println("Scalene Triangle ");
            }

        } else {
            System.out.println("Invalid Triangle ");
        }
    }
}
