package at.technikum.Einheit6.library;

public interface Rentable {
    boolean rent(Member member);
    boolean isAvialable(Item item);
    void returnItem();


}
