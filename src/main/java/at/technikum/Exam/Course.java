package at.technikum.Exam;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Element> elementList = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void addElement(Element element){
        elementList.add(element);
    }

    public void clear(){
        elementList.clear();
    }

    public void print() {
        System.out.println("Course: " + name);
        if (elementList.isEmpty()) {
            System.out.println("<empty>");
            System.out.print("\n");
            return;
        }
        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(i + 1 + ": " + elementList.get(i));
        }
        System.out.print("\n");

        int durchNummerierung = 1;
        for (int listenIndex = 0; listenIndex < elementList.size(); listenIndex++){

            System.out.print(durchNummerierung);
            System.out.println(elementList.get(listenIndex));

        }


    }

    public String getName() {
        return name;
    }

    public List<Element> getElementList() {
        return elementList;
    }
}
