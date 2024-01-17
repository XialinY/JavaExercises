package at.technikum.Einheit1;

import java.util.Scanner;

public class Oktal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Oktalzahl eingeben:\n");
        double in = sc.nextInt();

        int dezimal = 0;
        int i = 0;

        if (in<=999) {
            while (in != 0) {

                dezimal += (int) (in % 10) * (Math.pow(8, i));
                in /= 10;
                i++;

            }
        } else {

            System.out.println("Maximal eine 3-stellige Zahl eingeben!");
            return;
        }

        System.out.printf("In Dezimal: %d\n", dezimal);

        long summe = (int)dezimal%10 + dezimal%100/10 + dezimal%1000/100;

        System.out.printf("Ziffersumme: %d\n", summe);


    }

}
