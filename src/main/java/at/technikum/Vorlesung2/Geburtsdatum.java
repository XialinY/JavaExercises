package at.technikum.Vorlesung2;

import java.util.Scanner;

public class Geburtsdatum {

    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);

        System.out.println("Geburtsdatum (TTMMJJ):");
        int birthDate = consoleInput.nextInt();

        int day = birthDate/10000;
        int year = birthDate % 100;
        int month = (birthDate % 10000)/100; //equivalent to '(brithDate/100) % 100'

        System.out.printf("Ausgabe (JJMMTT): %02dY.%02dM.%02dD", year, month, day);

        consoleInput.close();

    }
}
