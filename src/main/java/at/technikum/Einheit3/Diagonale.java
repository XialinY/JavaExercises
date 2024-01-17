package at.technikum.Einheit3;

import java.util.Scanner;

public class Diagonale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seitenlaenge:");
        double seitenL = input.nextInt();

        // testing if the input is an uneven number
        while (((seitenL-1)%2) != 0) {
            System.out.println("Ungueltige Eingabe! Seitenlaenge muss ungerade sein!\nneue Eingabe:");
            seitenL = input.nextInt();
        }

        //loop for the diagonal '*'
        for (int i = 0 ;i < seitenL; i++){

            for (int j = 0 ;j < seitenL; j++) {
                //checking if the position is on the diagonal 'i == seitenL - 1 - j' checks the 'right' diagonal
                System.out.print(i == j || i == seitenL - j - 1 ? "*" : "-");
                //the '- 1' is there because the counting starts at 0 which means the input value
                //as we know it would be effectively (in this case) 'seitenL + 1'
            }
            System.out.println();
        }
    }
}
