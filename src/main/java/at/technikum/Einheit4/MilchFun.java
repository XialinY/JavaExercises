package at.technikum.Einheit4;

import java.util.Scanner;

public class MilchFun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Fett:");
        double fettInput = input.nextDouble();

        System.out.print("Haltbarkeit");
        int haltbarkeitInput = input.nextInt();


        int k = milchKlasse(fettInput,haltbarkeitInput);
        ausgabe(k);
        //ausgabe(milchKlasse(fettInput,haltbarkeitInput)); <- very confusing to read in the long run.
    }

    //if private, public, protected is not specified: package protected == only usable within the package
    static int milchKlasse(double fett, int haltbarkeit) {

        if (haltbarkeit == 1){
            if (fett >= 3 && fett <= 7) {
                return 6;
            }
            if (fett < 3) {
                return 4;
            }
            if (fett > 7) {
                return 2;
            }
        }

        if (haltbarkeit == 0){
            if (fett >= 3 && fett <= 7) {
                return 5;
            }
            if (fett < 3) {
                return 3;
            }
            if (fett > 7) {
                return 1;
            }
        }

        return -1;
    }

    static void ausgabe (int k) {

        switch (k) {
            case 1: {
                System.out.println("Extravollmilch (frisch)");
                break;}
            case 2: {
                System.out.println("Extravollmilch (haltbar)");
                break;}
            case 3: {
                System.out.println("Leichtmilch (frisch)");
                break;}
            case 4: {
                System.out.println("Leichtmilch (haltbar)");
                break;}
            case 5: {
                System.out.println("Normalmilch (frisch)");
                break;}
            case 6: {
                System.out.println("Normalmilch (haltbar)");
                break;}
            case -1: {
                System.out.println("Ungueltige Klassifizierung!");
                break;}
            default: {
                System.out.println("Ungueltiges Argument!");
                break;}
        }

    }
}
