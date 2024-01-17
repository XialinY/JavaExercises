package at.technikum.Vorlesung3;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int grade = 0;

        do {

            System.out.println("Grade (1-5): ");
            grade = input.nextInt();

        } while (1 > grade || grade > 5);

        System.out.println("Correct");

    }
}
