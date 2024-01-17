package at.technikum.Exercises.Library;

public abstract class Item {
    public String title;
    public String id;
    public Member rentedBy;

    public Item(String title, String id) {
        this.title = title;
        this.id = id;
    }
    public abstract int rentCost();
    public abstract void setRentedBy(Member member);


}
