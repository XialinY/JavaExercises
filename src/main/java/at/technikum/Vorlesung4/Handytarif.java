package at.technikum.Vorlesung4;

import java.util.Scanner;

public class Handytarif {
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("min:");
        int minuten = input.nextInt();
        System.out.print("SMS:");
        int sms = input.nextInt();

        if (minuten < 0 || sms < 0) {
            System.out.print("ungueltig.");
        } else {
            double summe = 5.99 + calcPreisMinuten(minuten) + calcPreisSMS(sms);
            System.out.printf("zu bezahlen: %.2f + %.2f + %.2f = %.2f", 5.99, calcPreisMinuten(minuten), calcPreisSMS(sms), summe);
        }
    }

    private static double calcPreisMinuten(int minuten){
        double preisMinuten;

        if (minuten <= 100 && minuten >= 0) {
            return 0;
        }
        preisMinuten = (minuten - 100) * 0.99;
        return preisMinuten;
    }

    private static double calcPreisSMS(int sms){
        double preisSMS = 0;

        if (sms <= 10 && sms >= 1) {
            preisSMS = sms * 0.05;
        }
        else if (sms <= 20 && sms >= 11) {
            preisSMS = 0.5 + (sms - 10) * 0.04;
        }
        else if (sms <= 50 && sms >= 21) {
            preisSMS = 0.9 + (sms - 20) * 0.03;
        }
        else if (sms <= 100 && sms >= 51) {
            preisSMS = 1.8 + (sms - 50) * 0.02;
        }
        else if (sms <= 1000 && sms >= 101) {
            preisSMS = 2.8 + (sms - 100) * 0.01;
        }
        else if (sms > 1000) {
            preisSMS = 11.8 + (sms - 1000) * 0.005;
        }

        return preisSMS;
    }
}
