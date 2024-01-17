package at.technikum.Vorlesung3;

import java.util.Scanner;

public class FensterKreuz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("width:");
        int width = input.nextInt();

        //checking each value
        while (width <= 0) {
            System.out.println("width:");
            width = input.nextInt();
        }

        System.out.println("height:");
        int height = input.nextInt();

        while (height <= 0) {
            System.out.println("height:");
            height = input.nextInt();
        }

        System.out.println("horizontal position of the cross:");
        int horizontal = input.nextInt();

        while (horizontal > width) {
            System.out.println("horizontal position of the cross:");
            horizontal = input.nextInt();
        }

        System.out.println("vertical position of the cross:");
        int vertical = input.nextInt();

        while (vertical > height) {
            System.out.println("vertical position of the cross:");
            vertical = input.nextInt();
        }

        //constructing the window:
        //going through each line
        for (int i = 0; i < height; i++) {
            //going through each column
            for (int j = 0; j < width; j++) {

                // '- 1' because counting starts with 0 and not 1.
                System.out.print(
                        (i == vertical - 1 && j == horizontal - 1) ? "+" :  //if
                        j == horizontal - 1 ? "|" :                         //else if
                        i == vertical - 1 ? "-" : ".");                     //else if -> else
                /*
                can be also solved with 'if' and 'else-if'
                like this:

                if (i == vertical - 1 && j == horizontal - 1) {
                    System.out.print("+");
                    }
                else if (j == horizontal - 1) {
                    System.out.print("|");
                    }
                else if (i == vertical - 1) {
                    System.out.print("-");
                    }
                else {
                    System.out.print(".");
                }
                */
            }
            System.out.println();
        }
    }
}
