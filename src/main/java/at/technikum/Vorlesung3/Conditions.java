package at.technikum.Vorlesung3;

public class Conditions {

    public static void main(String[] args) {

        int age = 17;
        int test = 5;

        if (age>=18) {

            int test2 = 192;
            //variable declared inside another "scope" ONLY exists there.
            //BUT variables declared outside this scope can still be used here
            test = 97;

            System.out.println(test);
            System.out.println(test2);
            System.out.println("Is adult");

        }
        else {

            test = 52;
            System.out.println("Is not adult");

        }

        if (age < 18) {

            return;
            //"early return pattern" - ends application early without it executing the codes after this line

        }

        System.out.println("End of application");

    }
}
