package at.technikum.Vorlesung1;

import java.util.Scanner;

public class Tax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency amount (in xxx,xx):");
        double in = sc.nextDouble();

        double tax = in * 1.2;
        System.out.printf("With tax added : %.2f", tax);

    }
}
