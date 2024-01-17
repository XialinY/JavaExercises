package at.technikum.Einheit3;

public class SwitchCase {

    public static void main(String[] args) {

        int age = 12;

        switch (age) {

            case 10: {
                System.out.println("Happy 10th Birthday");
                break;
            }

            case 11: {
                System.out.println("Happy 11th Birthday");
                break;
            }

            default: {
                System.out.println("No Happy Birthday For You :(");
                break;
            }
        }
    }
}
