package exception;

public abstract class InputException extends IllegalArgumentException {
    public InputException(String message) {
        super(message);
    }
}
