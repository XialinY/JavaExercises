package at.technikum.Einheit7.generics;

public interface List<T> {
    void add(int i);
    void removeAt(int index);
    int getAt(int index);
    void printContent();
    boolean contains(int i);
    int size();
}
