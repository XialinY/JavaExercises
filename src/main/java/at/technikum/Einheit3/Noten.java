package at.technikum.Einheit3;

import java.util.Scanner;

public class Noten {

    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);
        System.out.print("Enter your grades:");

        int grades = consoleInput.nextInt();
        consoleInput.close();


        if (grades>999 || grades<100 && grades!=0) {
            System.out.println("Expecting EXACTLY 3 grades");
            return;
        }

        int gradeOne = grades/100;
        int gradeTwo = grades/10%10;
        int gradeThree = grades%10;

        if (gradeOne < 1 || gradeOne > 5) {

            System.out.println("First grade must be between 1-5");

        }

        if (gradeTwo < 1 || gradeTwo > 5) {

            System.out.println("Second grade must be between 1-5");

        }

        if (gradeThree < 1 || gradeThree > 5) {

            System.out.println("Third grade must be between 1-5");
            return;

        }

        if (gradeOne == 5 || gradeThree == 5 || gradeTwo == 5) {

            System.out.println("Failed!");
            return;

        }

        //if (gradeOne <= 4 || gradeThree <= 4 || gradeTwo <= 4) {

            if (gradeOne == 1 && gradeThree == 1 && gradeTwo == 1) {

                System.out.println("Passed with excellence!");
                return;

            }

            if ((gradeOne == 1 && gradeThree == 1 && gradeTwo == 2) ||
                       (gradeOne == 1 && gradeThree == 2 && gradeTwo == 1) ||
                       (gradeOne == 2 && gradeThree == 1 && gradeTwo == 1)   ) {
            // also possible: if (gradeOne + gradeTwo + gradeThree == 4)

                System.out.println("Passed with greatness!");
                return;

            }
            System.out.println("Passed!");
// 'try - catch' exception catcher; closes any resources that was initialized in the try block
    }
}

