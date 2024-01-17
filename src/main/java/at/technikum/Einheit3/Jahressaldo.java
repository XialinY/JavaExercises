package at.technikum.Einheit3;

import java.util.Scanner;

public class Jahressaldo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double minValue = Double.MAX_VALUE;
        double maxValue = Double.MIN_VALUE;
        double sum = 0;
        int i = 0;

        while (i < 12) {
            System.out.printf("Month #%02d:", i + 1 );
            double currentValue = input.nextDouble();

            if (currentValue < minValue){
                minValue = currentValue;
            }
            if (currentValue > maxValue){
                maxValue = currentValue;
            }
            if (currentValue == 0) {
                System.out.print("Nullsummenspiel.\n");
            }
            sum += currentValue;
            i++;
        }
        System.out.printf("\nJahressaldo: %+.2f", sum);
        System.out.printf("\nGroesster Saldo: %+.2f", maxValue);
        System.out.printf("\nKleinster Saldo: %+.2f", minValue);
    }
}
