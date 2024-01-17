package at.technikum.Vorlesung4;

import java.util.Scanner;

public class GradeArray {
    public static void main(String[] args) {

        /*
        1. Grade: 3
        2. Grade: 5
        ...
        20. Grade: 3

        Average: 3.2
         */

        /*
        1. Grade: 3
        2. Grade: 5
        3. Grade: -1
        Current Average: 4
        ...
        20. Grade: 3

        Average: 3.2
         */

        int[] grades = new int[20];
        Scanner input = new Scanner(System.in);

        int i = 0;
        for (; i < grades.length; i++) {

            System.out.printf("Grade %2d: ", i+1);
            int currentValue = input.nextInt();

            if (currentValue == - 1) {
                System.out.println("Current average:" + averageCalc(grades,i));
                i--;
                //continue; does not read the code below and starts the next iteration of the loo
            } else grades[i] = currentValue;


/*          alternative code:
            if (currentValue == - 1) {
                System.out.println("Current average:" + averageCalc(grades,i));
                i--;
                continue; //here the code will ignore the 'grades[i] = currentValue;' part
                          //and goes to the next step of the loop.
            }

            grades[i] = currentValue;
*/

        }

        System.out.printf("Average: %.2f", averageCalc(grades, grades.length));
    }

    private static double averageCalc (int[] grades, int i) {

        double average = 0;
        double sum = 0;


        for (int j = 0; j < grades.length; j++) {
            sum += grades[j];
        }

        average = sum/i;

        return average;
        //return sum/grades.length;
    }
}
