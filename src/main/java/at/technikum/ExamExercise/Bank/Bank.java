package at.technikum.ExamExercise.Bank;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void deposit(Account account ,double amount){
        account.deposit(amount);
    }
    public void withdraw(Account account ,double amount){
        account.withdraw(amount);
    }
    public void printBalance() {
        for (Account a : accounts) {
            a.printBalance();
        }
    }
}
