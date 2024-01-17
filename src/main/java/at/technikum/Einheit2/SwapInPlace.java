package at.technikum.Einheit2;

import java.util.Scanner;

public class SwapInPlace {

    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter 2 int values:");

        int a = consoleInput.nextInt();
        int b = consoleInput.nextInt();

        System.out.printf("Before: \n a = %d \n b : %d \n", a,b);

        a = a+b; //
        b = a-b; // 'b' got a new value which can be used to calculate further - in this case 'b' became the old'a'
        a = a-b; //


        System.out.printf("After: \n a = %d \n b : %d", a,b);

        consoleInput.close();
    }
}
