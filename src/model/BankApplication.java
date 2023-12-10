package model;

import java.util.ArrayList;
import java.util.List;

public class BankApplication {
    private final List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() throws CloneNotSupportedException {
        List<Account> copyAccounts = new ArrayList<>();
        for (Account account : accounts) {
            copyAccounts.add((Account) account.clone());
        }
        return copyAccounts;
    }
}
