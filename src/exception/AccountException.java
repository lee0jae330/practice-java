package exception;

public abstract class AccountException extends IllegalArgumentException {
    public AccountException(String message) {
        super(message);
    }
}
