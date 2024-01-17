package at.technikum.Vorlesung2;

import java.util.Scanner;

public class InputHelloWorldExercise {

    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = consoleInput.nextLine();

        System.out.printf("\nHello %s", name);

        consoleInput.close();

    }
}
