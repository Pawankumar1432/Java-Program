package problemsolving;

import java.util.Scanner;

public class PerfectSquareCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPerfectSquare = false;

        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println(number + " is a Perfect Square.");
        } else {
            System.out.println(number + " is NOT a Perfect Square.");
        }
    }
}
