package at.technikum.Einheit2;

public class Types {

    public static void main(String[] args) { //anything between the "{}" is a scope

        int number = 123; //"number" - declaration, "123" - initialization; int - 32bit (size)

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        /*
        int number;
        number = 123;
        */

        long long_int = 123456; //long - 64bit (size)

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        float f_number = 123.123f; // "f" after 123.123 specifies the data as float type - otherwise java will assume it is a double

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        double d = 123.123;

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        char character = 'c'; //' for characters; " for strings; 16bit in size;

        System.out.println((int)character); //casting (int) - forcing 'character' to assume the data type of int
                                            //casting (double), (char), etc. would also work if the type allows it

        String text = "Hello World"; //String is an already declared class; char, int, float, etc. are basic data types

        boolean bool = true; //size: 1bit; boolean - true or false aka '1' or '0'

        short short_integer = 51; // long equivalent but short - size: 16bit

        final int CONSTANT_VALUE = 1234; //'final' means the value that has been initialized cannot be changed later.


    }

}
