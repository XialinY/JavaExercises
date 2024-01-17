package at.technikum.Vorlesung3;

public class Bools {

    public static void main(String[] args) {

        int age = 18;
        boolean isAdult = age >= 18;

        // >, <, >=, <=, ==, !=

        char nationality = 'A';
        boolean isFromAustria = nationality =='A';


        boolean allowedToVote = isAdult && isFromAustria; // '$$' means AND

        System.out.println(allowedToVote);
        System.out.println(isAdult);
        System.out.println(isFromAustria);


        boolean drinkBeer = isAdult || isFromAustria; // '||' means OR

        System.out.println(drinkBeer);

        //example for combination in 1 boolean declaration:
        //boolean access = (isAdmin || isSuperUser) && accountIsActive; expandable as much as you want

        boolean isAdmin = true;
        System.out.println(!isAdmin); //'!' turns a "true" into a "false" and vice versa


    }
}
