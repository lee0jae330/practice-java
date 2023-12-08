package util;

public enum ConstantOfSelection {

    MINIMUM_SELECTION_NUMBER(1),
    MAXIMUM_SELECTION_NUMBER(5);
    private final int number;

    ConstantOfSelection(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
