package at.technikum.Exam;

public class Test extends Element{
    private int numberOfQuestions;

    public Test(String name, int numberOfQuestions) {
        super(name);
        setNumberOfQuestions(numberOfQuestions);
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    private void setNumberOfQuestions(int numberOfQuestions) {
        if (numberOfQuestions < 0){
            this.numberOfQuestions = 0;
        } else this.numberOfQuestions = numberOfQuestions;
    }

    @Override
    public String toString() {
        return "[" + getName() + "] " + numberOfQuestions + " Question(s)";
    }
}

