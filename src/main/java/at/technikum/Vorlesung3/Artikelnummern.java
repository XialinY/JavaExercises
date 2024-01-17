package at.technikum.Vorlesung3;

import java.util.Scanner;

public class Artikelnummern {

    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);

        System.out.println("First number:");
        int gruppenID = consoleInput.nextInt();


        switch (gruppenID){

            case 1:

                System.out.println("\nSecond number:");
                int unterGruppeID = consoleInput.nextInt();

                switch (unterGruppeID) {
                    case 1:
                        System.out.println("\nThird number:");
                        int artikelNummer = consoleInput.nextInt();
                        switch (artikelNummer) {
                            case 1:
                                System.out.println("Bier (hell, 0.5)");
                                break;
                            case 2:
                                System.out.println("Bier (hell, 0.33)");
                                break;
                            case 3:
                                System.out.println("Zwickel (0.5)");
                                break;
                            case 4:
                                System.out.println("Zwickel (0.33)");
                                break;
                            default:
                                System.out.println("Falsche Eingabe");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("\nThird number:");
                        artikelNummer = consoleInput.nextInt();
                        switch (artikelNummer) {
                            case 1:
                                System.out.println("Cola");
                                break;
                            case 2:
                                System.out.println("Fanta");
                                break;
                            default:
                                System.out.println("Falsche Eingabe");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("\nThird number:");
                        artikelNummer = consoleInput.nextInt();
                        switch (artikelNummer) {
                            case 1:
                                System.out.println("Rotwein");
                                break;
                            case 2:
                                System.out.println("Weisser Spritzer");
                                break;
                            default:
                                System.out.println("Falsche Eingabe");
                                break;
                        }
                        break;
                };
                break;

            case 2:

                System.out.println("\nSecond number:");
                unterGruppeID = consoleInput.nextInt();

                switch (unterGruppeID) {
                    case 1:
                        System.out.println("\nThird number:");
                        int artikelNummer = consoleInput.nextInt();
                        switch (artikelNummer) {
                            case 1:
                                System.out.println("Schnitzel");
                                break;
                            case 2:
                                System.out.println("Schweinsbraten");
                                break;
                            default:
                                System.out.println("Falsche Eingabe");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("\nThird number:");
                        artikelNummer = consoleInput.nextInt();
                        switch (artikelNummer) {
                            case 1:
                                System.out.println("Frankfurter");
                                break;
                            default:
                                System.out.println("Falsche Eingabe");
                                break;
                        }
                        break;

                    case 9:
                        System.out.println("\nThird number:");
                        artikelNummer = consoleInput.nextInt();
                        switch (artikelNummer) {
                            case 1:
                                System.out.println("Ketchup");
                                break;
                            default:
                                System.out.println("Falsche Eingabe");
                                break;
                        }
                        break;

                    default:
                        System.out.println("Falsche Eingabe");
                        break;
                }
                break;

            case 3:

                System.out.println("\nSecond number:");
                unterGruppeID = consoleInput.nextInt();

                switch (unterGruppeID) {
                    case 1:
                        System.out.println("\nThird number:");
                        int artikelNummer = consoleInput.nextInt();
                        switch (artikelNummer) {
                            case 1:
                                System.out.println("Zigaretten");
                                break;
                            default:
                                System.out.println("Falsche Eingabe");
                                break;
                        }
                    default:
                        System.out.println("Falsche Eingabe");
                        break;
                }
                break;

            default:

                System.out.println("Falsche Eingabe");
                break;

        }

        consoleInput.close();
    }
}
