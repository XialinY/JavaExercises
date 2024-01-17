package at.technikum.Einheit4;

import java.util.Scanner;

public class GreaterLeft {
    static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Input array size: ");
        int[] inputArray = new int[input.nextInt()];
        int[] greaterLeft = new int[inputArray.length];
        readInput(inputArray);
        calcGreaterLeft(inputArray, greaterLeft);

        for (int i = 0; i < inputArray.length; i++) {
            System.out.printf("%2d ",inputArray[i]);
        }

        System.out.println();

        for (int i = 0; i < greaterLeft.length; i++) {
            System.out.printf("%2d ",greaterLeft[i]);
        }
        input.close();
    }

    private static void readInput(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(":");
            inputArray[i] = input.nextInt();
        }
    }

    private static void calcGreaterLeft (int[] inputArray, int[] greaterLeft) {
        for (int i = 0; i < inputArray.length; i++) {
             for (int j = 0; j <= i; j++) {
                 if (inputArray[(i-j)] > inputArray[i]) {
                     greaterLeft[i] += 1;
                 }
             }
        }
    }
}
