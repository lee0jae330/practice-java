package validator;

public class InputValidator {
    public static int checkValidation(String input) {
        checkInputIsEmpty(input);
        return checkInputIsNumber(input);
    }
    private static void checkInputIsEmpty(String input) {
        if(input.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    private static int checkInputIsNumber(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
}
