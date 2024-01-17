package at.technikum.Einheit7.generics;

public class ArrayListGenerics<T> implements List<T> {

    private int[] integers;

    private int counter;

    public ArrayListGenerics() {
        integers = new int[10];
        counter = 0;
    }

    @Override
    public void add(int number) {
        if (counter >= integers.length) {
            resize(integers.length + 10);
        }

        integers[counter] = number;
        counter++;
    }

    @Override
    public void removeAt(int index) {
        for (int i = index; i < counter; i++) {
            if (i + 1 == counter) {
                continue;
            }
            integers[i] = integers[i + 1];
        }
        counter--;
    }
    private void resize(int newSize) {
        int[] newIntegers = new int[newSize];
        for (int i = 0; i < integers.length; i++) {
            newIntegers[i] = integers[i];
        }
        integers = newIntegers;
    }
    @Override
    public int getAt(int index) {
        if (index >= counter || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return integers[index];
    }

    @Override
    public void printContent() {
        for (int i = 0; i < counter; i++) {
            System.out.println(integers[i]);
        }
    }

    @Override
    public boolean contains(int number) {
        for (int i = 0; i < counter; i++){
            if (integers[i] == number){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return counter;
    }
}
