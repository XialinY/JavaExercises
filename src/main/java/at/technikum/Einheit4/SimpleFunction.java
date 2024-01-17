package at.technikum.Einheit4;

public class SimpleFunction {

    public static void main(String[] args) {

        //bad example for optimized code
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello World");
//        }
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Wassap World");
//        }


//        we want something like this:
//        for (int i = 0; i < X; i++) {
//            System.out.println("Y");
//        }

        greet(5, "nothing", "Brother Jon"); //function call
        System.out.println("Test");
        greet(3, "french", "Doenerstag");
        greet(4, "german", "Tom" );

    }

    //let's look at 'public static void main'
    //public: every class can use this code
    //private: only the class that was defined in this file can use this code
    //protected: same as private but additionally parent classes can also access this code

    // void, int, char, double, etc. defines the return value of this code block

    //inside '()' we put parameters
    private static void greet (int repetition, String name, String language) {

        String greet = greetVariation(language);

        for (int i = 0; i < repetition; i++) {
            System.out.println(greet + name);
        }
    }

    private static String greetVariation (String language) {

        if (language.equals("german")) {
            return "Hallo";
        }

        if (language.equals("french")) {
            return "Bonjour";
        }

        return "Hello";
    }
}
