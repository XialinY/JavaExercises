package at.technikum.Einheit4;

import java.util.Scanner;

public class TimeCalculations {

    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);

        input.close();
    }

    private static int encode(int h, int m) {
        return (h * 100 + m);
    }

    private static int read() {
        System.out.print("hours:");
        int hours = input.nextInt();
        while (hours > 24 || hours < 1) {
            System.out.print("hours:");
            hours = input.nextInt();
        }

        System.out.print("minutes:");
        int minutes = input.nextInt();
        while (minutes > 60 || minutes < 0) {
            System.out.print("minutes:");
            minutes = input.nextInt();
        }

        return encode(hours, minutes);
    }

    private static int hours(int t) {
        return (t / 100);
    }

    private static int minutes(int t) {
        return (t % 100);
    }

    private static void print(int t) {
        System.out.printf("%02d:%02d", hours(t), minutes(t));
    }

    private static int add(int t1, int t2) {
        int totalHours = hours(t1) + hours(t2);
        int totalMinutes = minutes(t1) + minutes(t2);

            totalHours += totalMinutes / 60;
            totalMinutes = totalMinutes % 60;

        return ((totalHours % 24 * 100) + totalMinutes); //use function if possible
    }

    private static int total_minutes(int t) {
        return ((t / 100 )* 60 + (t % 100));
    }

}
