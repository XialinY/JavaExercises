package at.technikum.Einheit6.javacollections;

public interface List extends Collections{
    void add(int i);
    void removeAt(int index);
    int getAt(int index);
    void printContent();
    boolean contains(int i);
    int size();
}
