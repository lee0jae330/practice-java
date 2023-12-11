package util;

public enum ErrorMessage {

    INVALID_INPUT("잘못된 형식의 입력입니다."),
    INVALID_SELECTION("유효하지 않은 메뉴입니다."),
    INVALID_ACCOUNT("유효하지 않은 계좌입니다.");

    private final String message;
    private static final String ERROR = "[ERROR]";
    private static final String ENTER_AGAIN = "다시 입력해 주세요.";

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR + " " + message + " " + ENTER_AGAIN;
    }
}
