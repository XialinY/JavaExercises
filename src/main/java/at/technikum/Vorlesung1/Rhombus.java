package at.technikum.Vorlesung1;

import java.util.Scanner;

public class Rhombus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("a: ");
        int a = sc.nextInt();

        System.out.printf("b: ");
        int b = sc.nextInt();

        System.out.printf("c: ");
        int c = sc.nextInt();

        System.out.printf("d: ");
        int d = sc.nextInt();

        sc.nextLine();

        System.out.printf("e: ");
        double e = sc.nextDouble();


        System.out.printf("012345678901234567890123\n");
        System.out.println(" ");
        System.out.printf("%-10d /\\ %10d", a, b);
        System.out.printf("\n          /  \\");
        System.out.printf("\n         /    \\");
        System.out.printf("\n        | %+3.1f |"        , e);
        System.out.printf("\n         \\    /");
        System.out.printf("\n          \\  /");
        System.out.printf("\n%-10d \\/ %10d", c,d);


    }
}
