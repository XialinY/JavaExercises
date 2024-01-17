package at.technikum.Einheit4;

import java.util.Scanner;

public class Audio {
    static Scanner input;

    public static void main(String[] args) {

        input = new Scanner(System.in);
        double[] dataPackage = new double[16];
        int indexCounter = readInput(dataPackage);
        calculateAverage(dataPackage, indexCounter);
        input.close();
    }

    private static int readInput(double[] dataPackage) {
        int iCounter = 0;
        System.out.print("Max. 16 Werte eingeben, 0 beendet:\n");
        for (int i = 0; i < 16; i++) {
            System.out.print(":");
            double dataInput = input.nextDouble();
            //defaults input to 0 or -100 when input is out of bounds
            if (dataInput < -100) {
                dataInput = -100;
            } else if (dataInput > 0) {
                dataInput = 0;
            } else if (dataInput == 0) {
//              return iCounter;
                break;
            }
            dataPackage[i] = dataInput;
            iCounter++;
        }

        System.out.printf("Eingelesen: %2d\n", iCounter);
        return iCounter;
    }

    private static void calculateAverage(double[] dataPackage, int indexCounter) {
        System.out.print("Eingabe gibt die letzten x Werte, \ndie zur Durchschnittsrechnung gezaehlt werden sollen:");
        int durchschnittIndex = input.nextInt();
        double sum = 0;

        if (durchschnittIndex > indexCounter) {
            System.out.print("Zu wenige Werte!");
        } else {
            for (int j = 0; j < durchschnittIndex; j++) {
                    sum += dataPackage[((indexCounter - 1) - j)];
                }
            }
        System.out.printf("Durchschnittswert: %.2f", (sum / durchschnittIndex));
    }
}
