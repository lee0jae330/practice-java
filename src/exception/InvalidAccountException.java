package exception;

import util.ErrorMessage;

public class InvalidAccountException extends AccountException {
    public InvalidAccountException() {
        super(ErrorMessage.INVALID_ACCOUNT.getMessage());
    }
}
