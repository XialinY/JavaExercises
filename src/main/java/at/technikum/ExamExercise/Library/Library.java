package at.technikum.ExamExercise.Library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Item> items = new ArrayList();
    private String name;

    public Library(String name) {
        this.name = name;
    }

    public void addItem(Item item) {
        items.add(item);
    }
    public void removeItem(Item item) {
        items.remove(item);
    }
    public boolean isAvailable(Item item) {

        return true;
    }
    public Item searchItem(String id) {

        return null;
    }
    public Item searchAvailableCopy(String title) {
        return null;
    }
    public void borrowItem(Item item, Member member){

    }
    public void returnItem(Item item){

    }
    private void trash(Item item){
        items.remove(item);
    }

}
