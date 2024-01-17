package at.technikum.Vorlesung3;

import java.util.Scanner;

public class RoboterSteuerung {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Art:");
        int artSignal = input.nextInt();

        double wert = 0;

        double gyroX = 0;
        double gyroY = 0;
        double gyroZ = 0;

        double magnetoX = 0;
        double magnetoY = 0;
        double magnetoZ = 0;

        while (artSignal != 0) {

            switch (artSignal) {
                //Abstand vorne
                case 1: {
                    System.out.println("1:");
                    wert = input.nextDouble();
                    System.out.printf("Abstand vorne: %.2f m\n", wert);
                    if (wert < 0 || 10 < wert) {
                        System.out.println("** Fehler: Wertebereich");
                    }
                    break;
                }


                //Abstand hinten
                case 2: {
                    System.out.println("1:");
                    wert = input.nextDouble();
                    System.out.printf("Abstand hinten: %.2f m\n", wert);
                    if (wert < 0 || 10 < wert) {
                        System.out.println("** Fehler: Wertebereich");
                    }
                    break;
                }

                //Gyroskop (x/y/z)
                case 3: {
                    for (int i = 0; i < 3; i++) {
                        System.out.printf("%d:\n", i + 1);
                        wert = input.nextDouble();

                        if (i == 0) {
                            gyroX = wert;
                        }
                        if (i == 1) {
                            gyroY = wert;
                        }
                        if (i == 2) {
                            gyroZ = wert;
                        }
                    }
                    System.out.printf("Gyroskop: (%.2f, %.2f, %.2f) g\n", gyroX, gyroY, gyroZ);

                    if (    (gyroX < -250 || gyroX > 250) ||
                            (gyroY < -250 || gyroY > 250) ||
                            (gyroZ < -250 || gyroZ > 250)       ) {

                        System.out.println("** Fehler: Wertebereich");
                    }
                    break;
                }

                //Magnetometer
                case 4: {
                    for (int j = 0; j < 3; j++) {
                        System.out.printf("%d:\n", j + 1);
                        wert = input.nextDouble();

                        if (j == 0) {
                            magnetoX = wert;
                        }
                        if (j == 1) {
                            magnetoY = wert;
                        }
                        if (j == 2) {
                            magnetoZ = wert;
                        }
                    }
                    System.out.printf("Magnetometer: (%.2f, %.2f, %.2f) T\n", magnetoX, magnetoY, magnetoZ);

                    if (    (magnetoX < 0 || magnetoX > 1) ||
                            (magnetoY < 0 || magnetoY > 1) ||
                            (magnetoZ < 0 || magnetoZ > 1)      ) {

                        System.out.println("** Fehler: Wertebereich");
                    }
                    break;
                }

                default:
                    System.out.println("** Fehler: Art unbekannt!");
                    break;
            }

            System.out.println("Art:");
            artSignal = input.nextInt();
        }
    }
}
