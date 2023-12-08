package util;

public enum OutputViewMessage {

    HYPHEN("-"),
    MENUS("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료"),
    EXIT("프로그램 종료");

    private String message;

    OutputViewMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
