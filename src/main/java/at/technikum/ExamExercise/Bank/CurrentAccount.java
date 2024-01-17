package at.technikum.ExamExercise.Bank;

public class CurrentAccount implements Account{

    private double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void printBalance() {
        System.out.printf("Balance Current Account: $%.2f\n",balance);
    }
}
