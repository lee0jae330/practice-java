package util;

public enum ErrorMessage {

    INVALID_INPUT("잘못된 형식의 입력입니다.");

    private final String message;
    private static final String ERROR = "[ERROR]";

    ErrorMessage(String message) {
        this.message = message;
    }
}
