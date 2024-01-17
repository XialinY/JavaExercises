package at.technikum.Vorlesung2;

import java.util.Scanner;

public class Swapper {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter first number (a):");
        int a = input.nextInt();

        System.out.println("enter second number (b):");
        int b = input.nextInt();

        System.out.printf("a = %d, b = %d", a,b);

        int c = a;
        a = b;
        b = c;

        System.out.printf("\nswapped:\na = %d, b = %d", a,b);

        input.close();
    }
}
