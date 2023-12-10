package validator;

import java.util.regex.Pattern;

public class AccountValidator {
    private static final String ACCOUNT_NUMBER_REGEXP = "^[\\d]{3}-[\\d]{3}$";
    private static final String ACCOUNT_OWNER_REGEXP = "^[가-힣]{2,4}$";
    private static final int minimumOfInitAmount = 0;
    public static void checkValidation(String accountNumber, String accountOwner, int initAmount) {
        checkAccountNumber(accountNumber);
        checkAccountOwner(accountOwner);
        checkInitAmount(initAmount);
    }

    private static void checkAccountNumber(String accountNumber) {
        if(!Pattern.matches(ACCOUNT_NUMBER_REGEXP,accountNumber)) {
            throw new IllegalArgumentException();
        }
    }

    private static void checkAccountOwner(String accountOwner) {
        if(!Pattern.matches(ACCOUNT_OWNER_REGEXP,accountOwner)) {
            throw new IllegalArgumentException();
        }
    }

    private static void checkInitAmount(int initAmount) {
        if(initAmount < minimumOfInitAmount) {
            throw new IllegalArgumentException();
        }
    }
}
