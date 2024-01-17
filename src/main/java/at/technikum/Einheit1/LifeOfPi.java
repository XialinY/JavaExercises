package at.technikum.Einheit1;

public class LifeOfPi {

    public static void main(String[] args) {

        System.out.println("Life of Pi");
        System.out.println("----------");

/*Life of Pi
with default formating
12 characters wide
12 characters wide with exactly two digits after the decimal point
10 characters wide without fractional part
13 characters wide with 11 digits after the decimal point
15 digits wide with leading zeros
15 characters wide, with two digits after the decimal point and leading zeros and sign
*/

        float pi = 3.14159265359F;

        String formatedPi12CharsWide = String.format("12 characters wide: %12f\n", pi);

        System.out.printf(pi + "!\n");
        System.out.printf("Pi = %12f !\n", pi);
        //System.out.printf(formatedPi12CharsWide);
        System.out.printf("Pi = %12.2f !\n", pi);
        System.out.printf("Pi = %10.0f !\n", pi);
        System.out.printf("Pi = %13.11f !\n", pi);
        System.out.printf("Pi = %015f !\n", pi);
        System.out.printf("Pi = %+015.2f !\n", pi);

    }


}
