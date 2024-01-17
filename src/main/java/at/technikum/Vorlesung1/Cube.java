package at.technikum.Vorlesung1;

import java.util.Scanner;
import java.lang.Math;

public class Cube {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.printf("Length of a side:");


        int length = s.nextInt();
        System.out.printf("Surface area: %.0f \n", Math.pow(length,2)*6);
        System.out.printf("Volume: %.0f \n", Math.pow(length,3));
        s.close();

    }
}
