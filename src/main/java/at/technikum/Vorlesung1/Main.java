package at.technikum.Vorlesung1; //name for a package always small
                      //packages are in a fundamental sense a folder with related java class files
                      //

public class Main { //name of class always starts with large letter

    //always start like this
    public static void main (String[] args) { //translation for java: "start from here"

        System.out.printf("\"Hello World\"\n \\n \n"); //symbols can be introduced after a "\" while \n means next line.

        System.out.println("Hello V.2");

        System.out.printf("%s","Hello %s\n" ); //"String" means text (always in " ") % means placeholder, %s means placeholder for a string
                                               //"Object..." means java is expecting NONE or SEVERAL arguments (aka inputs)


        System.out.printf("%f %f %d\n", 3.231, 4., 2);
        //%d means placeholder for a DIGIT == integer, better: FLOAT - able to do decimals
        //% placeholder is important for DYNAMIC Data. eg: variables.


        //exercise: face
        System.out.printf(

                "0123456789012345\n"
                + "----------------\n"
                + "\\" + "\t           " + "/\n"
                + " \\" + "  \"\"\"  \"\"\"  " + "/\n"
                + "  \\" + "  o    o  " + "/\n"
                + "   \\" + "   --   " + "/\n"
                + "    \\" + "      " + "/\n"
                + "     \\" + "====" + "/\n"
                + "      \\" + "==" + "/\n"
                + "       \\" + "/\n");



        System.out.println("%");

        System.out.printf("%%");
        //to print % in printf() write "%" before. reason: % has the "placeholder function" -> it needs a special rule.

        //END OF EXERCISE1

// "/" means escape: it "escapes"(disables the programming function of) the following symbol.
// point deduction for unreadability.
//just use more syntax. 1 liner might be more efficient but unreadable/hard to understand code is bad




    }
    //System.out.println("Hello?");
}

