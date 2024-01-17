package at.technikum.Exercises.Bank;

public class Main {
    public static void main(String[] args) {
        Bank ersteBank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(1000,1.25);
        CurrentAccount currentAccount = new CurrentAccount(2000);

        ersteBank.addAccount(savingsAccount);
        ersteBank.addAccount(currentAccount);

        ersteBank.printBalance();

        System.out.println("\ndeposit 150, withdraw 200 from savings account");
        ersteBank.deposit(savingsAccount, 150);
        ersteBank.withdraw(savingsAccount, 200);

        System.out.println("\ndeposit 150 and withdraw 200 from current account");
        ersteBank.deposit(currentAccount, 150);
        ersteBank.withdraw(currentAccount, 200);

        ersteBank.printBalance();

        System.out.println("\n--applying interest rate on savings account--");
        savingsAccount.calculateInterest();

        System.out.println("new balance");
        ersteBank.printBalance();

    }
}
