package at.technikum.Vorlesung1;

import java.util.Scanner;

public class Hyperbel {

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

        System.out.printf("e: ");
        double e = sc.nextDouble();

        //DecimalFormat format = new DecimalFormat("000.000");
        System.out.printf("01234567890123456");
        System.out.printf("\n\\               /");
        System.out.printf("\n \\ %011d /", a);
        System.out.printf("\n  \\           /");
        System.out.printf("\n%-3d| %07.3f |%3d", b,e/*format.format(e)*/,c);
        System.out.printf("\n  /           \\");
        System.out.printf("\n / %011d \\", d);
        System.out.printf("\n/               \\");

    }

}
