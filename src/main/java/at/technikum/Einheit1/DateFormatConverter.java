package at.technikum.Einheit1;

import java.util.Scanner;

public class DateFormatConverter {

    public static void main(String[] args) {

        Scanner date = new Scanner(System.in);
        System.out.printf("enter date (yyyymmdd):\n");

        int d = date.nextInt();

        double min = 15821016;
        double max = 21001231;

        if (d<min) {
            System.out.printf("invalid date\n");
            return;
        }
        else if (d>max) {
            System.out.printf("invalid date\n");
            return;
        }

        System.out.printf("%02d.%02d.%4d\n",d%100,d%10000/100,d/10000);
        date.close();

    }
}
