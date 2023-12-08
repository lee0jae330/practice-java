package model;

public class Account {
    private final String accountNumber;
    private final String owner;
    private int amount;

    public Account(String accountNumber, String owner, int amount) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.amount = amount;
    }

}
