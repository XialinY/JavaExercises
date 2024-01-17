package at.technikum.Vorlesung1;

import java.util.Scanner;

public class Geburtsdatum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Geburtsdatum (TTMMJJ / DDMMYY):");
        long date = sc.nextLong();
        double year = date%100;
        double day = date/10000;
        double month = date%10000/100;



        System.out.printf("Ausgabe (JJMMTT / YYMMDD):\n %02.0f%02.0f%02.0f",year,month,day);


    }


}
