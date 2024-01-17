package at.technikum.Vorlesung6.javacollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        //LinkedList: data can be stored ANYWHERE in RAM and are 'linked'
        //ArrayList: data has to be stored "RIGHT NEXT TO EACH OTHER (in RAM)"

        names.add("Yo");
        names.add("Mama");
        names.add("Ugly");

        System.out.println(names.size());
        System.out.println();
        System.out.println(names.get(1));

    }
}
