package util;

public enum InputViewMessage {


    SELECTION("선택> ");
    private String message;

    InputViewMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
