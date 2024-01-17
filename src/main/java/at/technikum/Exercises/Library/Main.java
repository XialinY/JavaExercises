package at.technikum.Exercises.Library;

public class Main {
    public static void main(String[] args) {

        Member m = new Member("Marvin", 32, 123);
        Author one = new Author("Chris", 2, "Don Long");
        Director two = new Director("Chris", 2, "Long");

        Book book1 = new Book("How to Brick", "book1", one);
        book1.setRentedBy(m);
        System.out.println(m);
    }
}
