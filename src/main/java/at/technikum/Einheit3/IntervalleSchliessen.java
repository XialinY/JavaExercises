package at.technikum.Einheit3;

import java.util.Scanner;

public class IntervalleSchliessen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //input
        System.out.println("Intervall 1, Grenze 1:");
        int grenze1 = input.nextInt();
        System.out.println("Intervall 1, Grenze 2:");
        int grenze2 = input.nextInt();
        System.out.println("Intervall 2, Grenze 1:");
        int grenze3 = input.nextInt();
        System.out.println("Intervall 2, Grenze 2:");
        int grenze4 = input.nextInt();

        input.close();

        //checking for border relation - which one is smaller
        if (grenze1 > grenze2) {
            System.out.printf("[%+d,%+d]\n", grenze2, grenze1);
        } else {
            System.out.printf("[%+d,%+d]\n", grenze1, grenze2);
        }

        if (grenze3 > grenze4) {
            System.out.printf("[%+d,%+d]\n", grenze4, grenze3);
        } else {
            System.out.printf("[%+d,%+d]\n", grenze3, grenze4);
        }


        int temp = 0;
        //checking for the smallest interval that includes both intervals
        if (grenze2 <= grenze1) {
            temp = grenze1;
            grenze1 = grenze2;
            grenze2 = temp;
        }
        if (grenze3 <= grenze1) {
            temp = grenze1;
            grenze1 = grenze3;
            grenze3 = temp;
        }
        if (grenze4 <= grenze1) {
            temp = grenze1;
            grenze1 = grenze4;
            grenze4 = temp;
        }
        if (grenze4 <= grenze2) {
            temp = grenze2;
            grenze2 = grenze4;
            grenze4 = temp;
        }
        if (grenze4 <= grenze3) {
            temp = grenze3;
            grenze3 = grenze4;
            grenze4 = temp;
        }
        System.out.printf("geschlossenes Intervall: [%+d,%+d]", grenze1, grenze4);

    }
}
