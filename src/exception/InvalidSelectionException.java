package exception;

import util.ErrorMessage;

public class InvalidSelectionException extends SelectionException {
    public InvalidSelectionException() {
        super(ErrorMessage.INVALID_SELECTION.getMessage());
    }
}
