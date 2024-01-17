package at.technikum.Einheit3;

import java.util.Scanner;

public class MalReihe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int fixValue = 0;
        int grenzValue = 0;

        System.out.print("Fixfaktor:");
        int fixInput = input.nextInt();
        while (!(-10 <= fixInput && fixInput <= 10 && fixInput != 0)) {
            System.out.print("Fixfaktor:\n");
            fixInput = input.nextInt();
        }

        fixValue = fixInput;

        System.out.print("Grenzfaktor:");
        int grenzInput = input.nextInt();
        while (!(1 <= grenzInput && grenzInput <= 10)) {
            System.out.print("Grenzfaktor:");
            grenzInput = input.nextInt();
        }

        grenzValue = grenzInput;

        while (i+1 <= grenzValue) {
            System.out.printf("%2d x %+3d = %+4d\n", i + 1, fixValue, (i+1) * fixValue);
            i++;
        }
    }
}
