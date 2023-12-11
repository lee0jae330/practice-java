package model;

import java.util.ArrayList;
import java.util.List;

public class BankApplication {
    private final List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<String> getAllAccountInformation() {
        List<String> allAccountInformation = new ArrayList<>();
        for(Account account : accounts) {
            String information = account.getAccountInformation();
            allAccountInformation.add(information);
        }
        return allAccountInformation;
    }
}
