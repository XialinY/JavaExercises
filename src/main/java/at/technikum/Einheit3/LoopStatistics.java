package at.technikum.Einheit3;

import java.util.Scanner;

public class LoopStatistics {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter numbers (enter 0 to end the list):");

        long i = 0;
        double minValue = Double.MAX_VALUE;
        double maxValue = Double.MIN_VALUE;
        double sum = 0;
        while (i >= 0) {

            double digitInput = input.nextDouble();
            if (digitInput <= 0 && i > 1) {
                break;
            }
            if (digitInput <= 0 && i == 0) {
                System.out.println("no number entered");
                break;
            }
            if (digitInput < minValue && digitInput != 0) {
                minValue = digitInput;
            }
            if (digitInput > maxValue) {
                maxValue = digitInput;
            }
            sum += digitInput;
            i++;
        }
        String min = "minimum";
        String max = "maximum";
        String mean = "mean";

        System.out.printf("numbers entered = %d\n", i);
        System.out.printf("%-8s = %.2f\n", min, minValue);
        System.out.printf("%-8s = %.2f\n", max, maxValue);
        System.out.printf("%-8s = %.2f\n", mean, sum/i);
    }
}
