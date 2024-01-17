package at.technikum.OOPexercises;

public class Bank {
    private Account[] account;
    private String name;

    public Bank(Account[] account, String name) {
        this.account = account;
        this.name = name;
    }

    public void addAcount(Account account){

    }

    public void removeAccount(Account acocunt){

    }

    private void extendArray(int number){

    }
    public Account[] getAccount() {
        return account;
    }

    public void setAccount(Account[] account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
