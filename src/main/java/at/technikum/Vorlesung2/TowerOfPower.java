package at.technikum.Vorlesung2;

import java.util.Scanner;

public class TowerOfPower {

    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);
        System.out.print("enter base for The Tower: ");
        int a = consoleInput.nextInt();
        int tempa = a;
        int i=1;
/*
        while (i<=7) {

            System.out.printf("%10.0f\n", Math.pow(a,i));
            i++;

        }
*/

        while (i<=7) {

            System.out.printf("%10d\n", a);
            i++;
            a = tempa * a;

        }

        consoleInput.close();

    }
}
