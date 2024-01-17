package at.technikum.Einheit3;

import java.util.Scanner;

public class Datum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int date = 0;
        for (int i = 0; i < 2; i++) {

            System.out.println("\nDatum (TTMMJJJJ):");
            date = input.nextInt();

            int day = date / 1000000;
            int month = date / 10000 % 100;
            int year = date % 10000;
            if (day < 1 || day > 31) {
                System.out.println("Day value must be between 1-31");
            }
            if (month < 1 || month > 12) {
                System.out.println("Month value must be between 1-12");
            }
            if (year == 1582 || year < 1582 && month == 10
               || year < 1582 && month < 10 && day <= 15
               || year < 1582 && month != 10 && day <= 15) {

                System.out.println("Date must be after 15. October. 1582");
                return;
            }

            String monthName = " ";

            switch (month) {

                case 1 -> monthName = "January";
                case 2 -> monthName = "February";
                case 3 -> monthName = "March";
                case 4 -> monthName = "April";
                case 5 -> monthName = "May";
                case 6 -> monthName = "June";
                case 7 -> monthName = "July";
                case 8 -> monthName = "August";
                case 9 -> monthName = "September";
                case 10 -> monthName = "October";
                case 11 -> monthName = "November";
                case 12 -> monthName = "December";

            }

            System.out.printf("%02d. %s %d\n", day, monthName,year);
        }

    }
}
