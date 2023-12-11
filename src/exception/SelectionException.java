package exception;

import util.ErrorMessage;

public abstract class SelectionException extends IllegalArgumentException {
    public SelectionException(String message) {
        super(message);
    }
}
