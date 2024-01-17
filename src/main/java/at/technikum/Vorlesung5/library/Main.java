package at.technikum.Vorlesung5.library;

import javax.imageio.ImageReader;

public class Main {

    public static void main(String[] args) {

        Author bob = new Author("Bob");
        Book eigthyfour = new PaperBook("B-1", "192374012374", bob, "1984", 273);
        Book animalfarm = new PaperBook("B-2", "809132841972", bob, "Animal Farm", 180);
        Movie missionimpossible = new Movie("M-1", "Mission Impossible");
        Library library = new Library("FH Technikum");


        library.addItem(eigthyfour);
        library.addItem(animalfarm);
        library.addItem(missionimpossible);


        System.out.println(library.findItem("B-2"));


        Item item1 = library.findItem("B-2");
        if (item1 instanceof Book) { //'instanceof' asks if a class is a child/parent of another class
            System.out.println(((Book) item1).getTitle());
        }

        Member xialin = new Member(23, "Xialin");
        System.out.println(library.rent(item1, xialin)); //true
        System.out.println(library.rent(item1, xialin)); //false
        library.returnItem(item1);
        System.out.println(library.rent(item1, xialin)); //true


//        Item item1 = new Item("extraspicy");
//        library.addItem(item1);
    }
}
