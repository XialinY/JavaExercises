package at.technikum.Einheit3;

import java.util.Scanner;

public class Walker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i == 9 && j == 0 ? "X" : ".");
            }
            System.out.println();
        }

        System.out.println();

        int eingabe = 0;
        int schritte = 0; //Anzahl Schritte
        int x = 0; //koordinate x
        int y = 9; //koordinate y

        while (eingabe != 5) {

            System.out.print("Eingabe:");
            eingabe = input.nextInt();

            switch (eingabe) {
                //go down
                case 2:
                    if (y + 1 > 9) {
                        System.out.println("Aktion unmoeglich!");
                        schritte--;
                        break;
                    }
                    y += 1;
                    break;

                //go left
                case 4:
                    if (x - 1 < 0) {
                        System.out.println("Aktion unmoeglich!");
                        schritte--;
                        break;
                    }
                    x -= 1;
                    break;

                //end program
                case 5:
                    System.out.printf("Anzahl der Schritte: %d", schritte + 1);
                    return;

                //go right
                case 6:
                    if (x + 1 > 9) {
                        System.out.println("Aktion unmoeglich!");
                        schritte--;
                        break;
                    }
                    x += 1;
                    break;

                //go up
                case 8:
                    if (y - 1 < 0) {
                        System.out.println("Aktion unmoeglich!");
                        schritte--;
                        break;
                    }
                    y -= 1;
                    break;

                default:
                    System.out.println("Unbekannte Aktion!");
                    schritte--;
                    break;
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(i == y && j == x ? "X" : ".");
                }
                System.out.println();
            }

            System.out.println();
            schritte++;
        }
        input.close();
    }
}
