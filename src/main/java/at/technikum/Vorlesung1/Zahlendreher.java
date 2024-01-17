package at.technikum.Vorlesung1;

import java.util.Scanner;

public class Zahlendreher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Zahl: ");
        int in = sc.nextInt();
        if (in<=999) {
            int i = in % 10;
            int j = in % 100 / 10;
            int k = in % 1000 / 100;

            System.out.printf("Zahlendreher Ausgabe: %d%d%d", i, j, k);
        } else {

            System.out.println("Maximal eine 3-Stellige Zahl eingeben!");
        }

        sc.close();

    }
}
