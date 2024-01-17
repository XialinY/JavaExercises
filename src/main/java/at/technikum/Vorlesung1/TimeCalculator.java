package at.technikum.Vorlesung1;

import java.util.Scanner;

public class TimeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Welcome to the TimeCalculator!\n" +
                "please enter a duration in milliseconds:\n");

        long in = sc.nextLong();

        long ms = in%1000;
        /*long tempsec = in/1000;
        long tempmin = tempsec/60;
        long temphour = tempmin/60;*/
        long day = (in/1000)/60/60/24/*temphour/24*/;
        long sec = (in/1000)%60/*tempsec%60*/;
        long min = (in/1000/60)%60/*tempmin%60*/;
        long hour = (in/1000/60/60)%24/*temphour%24*/;



        System.out.printf("\n%d ms are exactly:",in);
        System.out.printf("\n%8s %d","days",day);
        System.out.printf("\n%8s %d","hours",hour);
        System.out.printf("\n%8s %d","minutes",min);
        System.out.printf("\n%8s %d","seconds",sec);
        System.out.printf("\n%8s %d","ms",ms);

        sc.close();
    }
}
