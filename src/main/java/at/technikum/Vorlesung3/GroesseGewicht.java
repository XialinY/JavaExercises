package at.technikum.Vorlesung3;

import java.util.Scanner;

public class GroesseGewicht {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            System.out.println("Height:");
            int height = input.nextInt();

            if (height < 0) {
                System.out.println("invalid height value");
                return;
            }

            System.out.println("Weight:");
            int weight = input.nextInt();

            if (weight < 0) {
                System.out.println("invlaid weight value");
                return;
            }

            if (weight <= 90 && height <= 200) {
                System.out.print("normal");
            }
            if (weight <= 90 && height > 200) {
                System.out.print("hager");
            }
            if (weight > 90 && height <= 200) {
                System.out.print("uebergewichtig");
            }
            if (weight > 90 && height > 200) {
                System.out.print("riesig");
            }
            if (weight > 200 || height < 50) {
                System.out.print("(*)\n\n");
            }
        }

        input.close();

    }
}
