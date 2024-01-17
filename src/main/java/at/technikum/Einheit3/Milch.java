package at.technikum.Einheit3;

import java.util.Scanner;

public class Milch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Fettgehalt:");
        double fat = input.nextDouble();
        System.out.println("Haltbarkeit:");
        int dura = input.nextInt();

        input.close();

        if (fat < 0) {
            System.out.println("Invlaid Input!");
            return;
        }

        if (dura < 0 || dura > 1) {
            System.out.println("Invlaid Input!");
            return;
        }

        if (fat < 3 && dura == 0) {
            System.out.println("Leichtmilch (frisch)");
        }
        if (fat < 3 && dura == 1) {
            System.out.println("Leichtmilch (haltbar)");
        }
        if (fat < 7 && dura == 0) {
            System.out.println("Extravollmilch (frisch)");
        }
        if (fat > 7 && dura == 1) {
            System.out.println("Extravollmilch (haltbar)");
        }
        if ((3 <= fat && fat<= 7) && dura == 0) {
            System.out.println("Normalmilch (frisch)");
        }
        if ((3 <= fat && fat<= 7) && dura == 1) {
            System.out.println("Normalmilch (haltbar)");
        }
    }
}
