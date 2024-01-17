package at.technikum.Vorlesung3;

import java.util.Scanner;

public class TickTrickTrack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nextInput = 0;

        double one = 0;
        double two = 0;
        //three could be left at 0, but to ensure that the first time a value is entered
        //"Tick, Trick or Track" is not displayed this little "trick" is used
        double three = Double.MIN_VALUE;

        int i = 0;
        int j = 0;

        System.out.println("Eingabe:");
        nextInput = input.nextDouble();

        while (i >= 0) {
            //storing every input (dynamically) into a variable by mathematically "addressing" each input
            if (i == 0 + j * 3) {
                one = nextInput;

                //checking if the input value before this one was >,< or = the current input
                if (one == three) {
                    System.out.println("Track");
                }
                //this if-statement ensures when this loop is executed for the first time
                //that no "Tick,Trick or Track" will be displayed
                if (one > three && three == Double.MIN_VALUE) {
                    System.out.print("");
                } else System.out.println("Trick");

                if (one < three) {
                    System.out.println("Tick");
                }
            }

            if (i == 1 + j * 3) {
                two = nextInput;
                //checking if the value before this one was >,< or =
                if (one == two) {
                    System.out.println("Track");
                }
                if (one > two) {
                    System.out.println("Tick");
                }
                if (one < two) {
                    System.out.println("Trick");
                }
            }

            if (i == 2 + j * 3) {
                three = nextInput;

                //checking if the value before this one was >,< or =
                if (three == two) {

                    //quit if last 3 inputs are the same
                    if (one == two && one == three) {
                        System.out.printf("Ende (%d Eingaben).", i + 1);
                        return;
                    }
                    System.out.println("Track");
                }
                if (three > two) {
                    System.out.println("Trick");
                }
                if (three < two) {
                    System.out.println("Tick");
                }
            }

            //'j' increases every 3rd iteration of i
            if ((i + 1) % 3 == 0) {
                j++;
            }

            System.out.print("Eingabe:");
            nextInput = input.nextDouble();

            i++;
        }
    }
}
