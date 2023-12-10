package util;

public enum InputViewMessage {
    SELECTION("선택> "),
    ACCOUNT_NUMBER("계좌번호: "),
    ACCOUNT_OWNER("계좌주: "),
    INIT_DEPOSIT_AMOUNT("초기입금액: "),
    DEPOSIT_AMOUT("예금액: "),
    WITHDRAWAL_AMOUNT("출금액: ");
    private String message;

    InputViewMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
