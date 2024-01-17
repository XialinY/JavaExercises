package at.technikum.Exercises.Bank;

public class SavingsAccount implements Account{

    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    public void calculateInterest() {
        balance *= interestRate;
    }

    @Override
    public void printBalance() {
        System.out.printf("Balance Savings Account: $%.2f\n",balance);
    }
}
