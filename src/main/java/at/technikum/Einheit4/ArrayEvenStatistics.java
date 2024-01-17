package at.technikum.Einheit4;

import java.util.Scanner;

public class ArrayEvenStatistics {
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        int currentInput;
        int[] numbers = new int[1024];
        int evenSum = 0;
        int evenMax = Integer.MIN_VALUE;
        int[] indexPositions = new int[1024];
        int indexCount = 0;
        int i = 0;

        System.out.print("Input");
        for (; i < 1024; i++) {
            System.out.print(":");
            currentInput = input.nextInt();
            //input termination question
            if (currentInput == 0) {
                System.out.print("re-enter 0 to store as value.\n any other value ends input:");
                currentInput = input.nextInt();
                if (currentInput != 0) {
                    System.out.print("Input finished.\n");
                    break;
                    //stores '0' if '0' is entered 2x in succession
                } else numbers[i] = currentInput;
            }
            numbers[i] = currentInput;
            //checking for even input numbers
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
                //saving the even indices
                indexPositions[indexCount] = i;
                indexCount++;
                //from the even numbers check for the maximum
                if (numbers[i] > evenMax) {
                    evenMax = numbers[i];
                }
            }
        }

        System.out.printf("%16s %d\n", "count:", indexCount);

        System.out.printf("%18s", "index postions: [");
        for (int j = 0; j < indexCount; j++) {
            System.out.print(indexPositions[j] + " ");
        }
        System.out.print("]\n");

        System.out.printf("%16s %d\n", "sum:", evenSum);
        System.out.printf("%16s %.2f\n", "mean:", (double) evenSum / indexCount);

        System.out.printf("%16s ", "max:");
        System.out.print(evenMax + " [");
        for (i = 0; i < 1024; i++ ) {
            if (numbers[i] == evenMax) {
                System.out.print(i + " ");
            }
        }
        System.out.print("]\n");

        input.close();
    }
}
