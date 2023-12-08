package model;

import java.util.List;

public class BankApplication {
    private List<Account> accounts;

    public void addAccount(Account account) {
        accounts.add(account);
    }
}
