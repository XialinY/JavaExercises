package at.technikum.Einheit1;

import java.util.Scanner;

public class Age_of_Empires {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Your age: ");
        int in = sc.nextInt();

        System.out.printf("%-5s ~%d~", "%d:",in);
        System.out.printf("\n%-5s ~%+d~", "%+d:",in);
        System.out.printf("\n%-5s ~% d~", "% d:",in);
        System.out.printf("\n%-5s ~%5d~", "%5d:",in);
        System.out.printf("\n%-5s ~%05d~", "%05d:",in);
        System.out.printf("\n%-5s ~%-5d~", "%-5d:",in);
        System.out.printf("\n%-5s ~%#x~", "%#x:",in);

    }

}
