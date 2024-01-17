package at.technikum.Vorlesung2;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //general info to 'class': 'class' can be seen as a Blueprint, while an 'object' is something that is built from the Blueprint.

        System.out.println("input an integer value for x:");
        int x = sc.nextInt();

        int volume = x*x*x;
        int surfacearea = 6*x*x;

        System.out.printf("\nVolume: %d",volume);
        System.out.printf("\nSurface Area: %d",surfacearea);

        sc.close();

    }
}
