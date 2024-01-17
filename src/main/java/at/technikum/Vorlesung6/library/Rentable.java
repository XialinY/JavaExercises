package at.technikum.Vorlesung6.library;

public interface Rentable {
    boolean rent(Member member);
    boolean isAvialable(Item item);
    void returnItem();


}
