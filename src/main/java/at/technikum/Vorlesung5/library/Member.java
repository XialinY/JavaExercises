package at.technikum.Vorlesung5.library;

public class Member {
    private int number;
    private String name;
    public Member(int number, String name) {
        setName(name);
        setNumber(number);
    }






    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
