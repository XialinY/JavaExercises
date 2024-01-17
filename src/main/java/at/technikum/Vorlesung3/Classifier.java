package at.technikum.Vorlesung3;

import java.util.Scanner;

public class Classifier {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int quality = 0;
        int price = 0;

        for (int i = 0; i < 2; i++) {

            System.out.println("enter quality:");
            quality = input.nextInt();

            System.out.println("enter price");
            price = input.nextInt();


            if (quality < 50) {
                System.out.println("low quality");
            } else {
                System.out.println("high quality");
            }

            if (price < 50) {
                System.out.println("low price");
            } else {
                System.out.println("high price");
            }

            if (quality < 50 && price < 50) {
                System.out.println("junk\n");
            }
            if (quality < 50 && price >= 50) {
                System.out.println("rip off\n");
            }
            if (quality >= 50 && price < 50) {
                System.out.println("bargain\n");
            }
            if (quality >= 50 && price >= 50) {
                System.out.println("luxury\n");
            }
        }
    }
}