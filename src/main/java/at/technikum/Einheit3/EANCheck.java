package at.technikum.Einheit3;

import java.util.Scanner;

public class EANCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter all 13 digits of an EAN:");
        long eaNumber = input.nextLong();

        long eaNumberDigits = eaNumber/10;
        long [] digits = new long[12];

        //calculating and storing each digit of the EAN into a numerized array
        for (int i = 0; i < 12; i++) {

            digits[i] = eaNumberDigits%10;
            eaNumberDigits /= 10;
            //System.out.println(digits[i]);

        }

        //calculating the sum of the even and then the uneven digit slots
        long sumEven = 0;
        long sumUneven = 0;

        //because we calculated without the last digit (checksum) and we numerized the array from
        //right to left instead of left to right -> careful with which loop is 'even' and which is 'uneven'!
        for (int i = 1; i < 12; i += 2) {

            sumUneven += digits[i];

        }
        //System.out.println(sumEven); <- first time mistake. we thought uneven entries in array was for 'even'

        for (int i = 0; i < 12; i += 2) {

            sumEven += digits[i];

        }
        //System.out.println(sumUneven); <- the same mistake again


        //checksum calculation
        long sumTogether = 9 - (((sumEven * 3 + sumUneven) - 1 ) % 10);

        //System.out.println(sumTogether);

        //checking if the checksum corresponds with the last digit of the EAN
        if (sumTogether != eaNumber%10) {
            System.out.println("The EAN is INVALID!");
            return;
        }
        System.out.println("The EAN is VALID!");
        //9783890111049
    }
}
