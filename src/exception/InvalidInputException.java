package exception;

import util.ErrorMessage;

public class InvalidInputException extends InputException {
    public InvalidInputException() {
        super(ErrorMessage.INVALID_INPUT.getMessage());
    }
}
