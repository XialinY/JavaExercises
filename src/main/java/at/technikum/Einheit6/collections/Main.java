package at.technikum.Einheit6.collections;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);

        list.printContent();

        System.out.println();
        System.out.println(list.size());
        System.out.println();

        list.removeAt(0);

        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);

        list.removeAt(39);

        list.printContent();
        System.out.println();
        System.out.println(list.size());
        System.out.println();
    }
}
