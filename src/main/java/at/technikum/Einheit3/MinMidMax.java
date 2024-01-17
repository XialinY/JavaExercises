package at.technikum.Einheit3;

import java.util.Scanner;

public class MinMidMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("input 3 integer numbers:");
        System.out.println("a:");
        int a = input.nextInt();
        System.out.println("b:");
        int b = input.nextInt();
        System.out.println("c:");
        int c = input.nextInt();

        //too much brute forcing - mathematical alternative exist!
        //hint: 'Mapping'
        if (a <= b && b <= c) {

            if (a == b && b == c) {
                System.out.printf("%d = %d = %d\n", a, b, c);
                System.out.println("a = b = c");
                }
            if (a == b && b < c) {
                System.out.printf("%d = %d < %d\n", a, b, c);
                System.out.println("a = b < c");
            }
            if (a < b && b < c) {
                System.out.printf("%d < %d < %d\n", a, b, c);
                System.out.println("a < b < c");
            }
        }

        if (a >= b && b >= c) {

            if (a == b && b > c) {
                System.out.printf("%d = %d > %d\n", a, b, c);
                System.out.println("a = b > c");
            }
            if (a > b && b > c) {
                System.out.printf("%d < %d < %d\n", c, b, a);
                System.out.println("c < b < a");
            }
        }

        if (a >= b && b <= c) {

            if (a > b && b < c && c > a) {
                System.out.printf("%d < %d < %d\n", b, a, c);
                System.out.println("b < a < c");
            }
            if (a > b && b < c && a > c) {
                System.out.printf("%d < %d < %d\n", b, c, a);
                System.out.println("b < c < a");
            }
            if (a==c && b < a) {
                System.out.printf("%d < %d = %d\n", b, a, c);
                System.out.println("b < a = c");
            }
        }

        if (a==c && b > a) {
            System.out.printf("%d = %d < %d\n", a, c, b);
            System.out.println("a = c < b");
        }

        if (a <= b && b >= c) {

            if (a < b && b == c) {
                System.out.printf("%d < %d = %d\n", a, b, c);
                System.out.println("a < b = c");
            }
            if (a < b && b > c && c > a) {
                System.out.printf("%d < %d < %d\n", a, c, b);
                System.out.println("a < c < b");
            }
        }
    }
}
