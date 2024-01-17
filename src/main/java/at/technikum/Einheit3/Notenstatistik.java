package at.technikum.Einheit3;

import java.util.Scanner;

public class Notenstatistik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Noteneingabe:");
        System.out.print(":");
        int note = input.nextInt();
        int i = 0; //anzahl der eingegebenen noten
        int k = 0; //anzahl der falscheingaben
        int anzahlFunf = 0;
        double sum = 0;

        while (note != 0) {
            System.out.print(":");
            note = input.nextInt();

            //notensumme fuer notendurchschnitt rechner + pruefen ob note 1-5
            if (note >= 1 && note <= 5) {
                sum += note;
            } else {
                System.out.println("Falsche Eingabe!");
            }

            //anzahl note 5 zaehler
            if (note == 5) {
                anzahlFunf ++;
                k++;
            }

            i++;
        }
        System.out.printf("""
                Notendurchschnitt:%.2f\s
                Anzahl Funfer:%2d\s
                Anzahl eingegebene Noten:%d""", sum/(i-k+1), anzahlFunf+1, i+1);
    }
}
