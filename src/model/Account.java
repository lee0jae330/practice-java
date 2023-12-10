package model;

import validator.AccountValidator;

public class Account implements Cloneable {
    private final String accountNumber;
    private final String owner;
    private int amount;

    public Account(String accountNumber, String owner, int amount) {
        AccountValidator.checkValidation(accountNumber,owner,amount);
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.amount = amount;
    }

    public String getAccountInformation() {
        return accountNumber+'\t'+owner+'\t'+amount;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
