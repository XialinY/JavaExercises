package at.technikum.Exercises.Library;

public class Member extends Person{
    private int id;
    private int credit;
    private boolean isStudent;

    public Member(String name, int age, int id) {
        super(name, age);
        this.id = id;
        isStudent(age);
        startingBonus();
    }

    private void isStudent(int age){
        if (age < 25){
            this.isStudent = true;
        } else this.isStudent = false;
    }

    private void startingBonus(){
        if (isStudent){
            credit += 50;
        }
        credit += 30;
    }

    public void addCredit(int credit){

    }

    public void removeCredit(int credit){

    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", credit=" + credit +
                ", isStudent=" + isStudent +
                '}';
    }
}
