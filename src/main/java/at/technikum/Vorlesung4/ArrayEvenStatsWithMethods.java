package at.technikum.Vorlesung4;

import java.util.Scanner;

public class ArrayEvenStatsWithMethods {
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);

        int[] numbers = new int[1024];
        int[] indexPositions = new int[1024];
        int indexCount = getInput(numbers, indexPositions);
        int evenSum = calculateEvenSum(numbers, indexPositions, indexCount);
        int evenMax = findMaxValue(numbers, indexPositions, indexCount);

        printStuff(numbers, indexPositions, indexCount, evenSum, evenMax);
        
        input.close();
    }
    private static int getInput (int[] numbers, int[] indexPositions){
        int currentInput;
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
                //saving the even indices
                indexPositions[indexCount] = i;
                indexCount++;
            }
        }
        return indexCount;
    }

    private static int calculateEvenSum (int[] numbers, int[] indexPositions, int indexCount) {
        int evenSum = 0;
        for (int i = 0; i < indexCount; i++){
            evenSum += numbers[indexPositions[i]];
        }
        return evenSum;
    }

    private static int findMaxValue (int[] numbers, int[] indexPositions, int indexCount) {
        int evenMax = Integer.MIN_VALUE;
        for (int i = 0; i < indexCount; i++){
            if (numbers[indexPositions[i]] > evenMax) {
                evenMax = numbers[indexPositions[i]];
            }
        }
        return evenMax;
    }

    private static void printStuff (int[] numbers, int[] indexPositions, int indexCount, int evenSum, int evenMax) {
        System.out.printf("%16s %d\n", "count:", indexCount);

        System.out.printf("%18s", "index positions: [");
        for (int j = 0; j < indexCount; j++) {
            System.out.print(indexPositions[j] + " ");
        }
        System.out.print("]\n");

        System.out.printf("%16s %d\n", "sum:", evenSum);
        System.out.printf("%16s %.2f\n", "mean:", (double) evenSum / indexCount);

        System.out.printf("%16s ", "max:");
        System.out.print(evenMax + " [");
        for (int i = 0; i < 1024; i++ ) {
            if (numbers[i] == evenMax) {
                System.out.print(i + " ");
            }
        }
        System.out.print("]\n");
    }

}
