package at.technikum.Einheit3;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Grade (1-5): ");
        int grade = input.nextInt();

        //while loop is used when the amount of repetition is unclear/unknown
        //for loop is used when the exact amount of repetitions is known
        while (1 > grade || grade > 5) {

            System.out.println("Grade (1-5):");
            grade = input.nextInt();

        }

        System.out.println("Correct!");
    }
}
