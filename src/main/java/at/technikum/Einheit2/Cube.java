package at.technikum.Einheit2;

public class Cube {


    public static void main(String[] args) {

        int x = 5;
        int area = x * x;
        int circumference = 4 * x;


        int volume = (int) Math.pow(x,3);
        int surfaceArea = 6 * area;


        System.out.printf("Length: %d\n", x);
        System.out.printf("Area: %d\n", area);
        System.out.printf("Circumference: %d\n", circumference);
        System.out.printf("\n\nSurface Area: %d\n", surfaceArea);
        System.out.printf("Volume: %d\n", volume);


    }
}
