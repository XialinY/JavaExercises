package at.technikum.Einheit6.collections;

public interface List {
    void add(int i);
    void removeAt(int index);
    int getAt(int index);
    void printContent();
    boolean contains(int i);
    int size();
}
