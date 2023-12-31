package validator;

import exception.InvalidInputException;

public class InputValidator {
    public static int checkNumberInputValidation(String input) {
        checkInputIsEmpty(input);
        return checkInputIsNumber(input);
    }

    public static String checkStringInputValidation(String input) {
        checkInputIsEmpty(input);
        return input;
    }


    private static void checkInputIsEmpty(String input) {
        if(input.isEmpty()) {
            throw new InvalidInputException();
        }
    }

    private static int checkInputIsNumber(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InvalidInputException();
        }
    }
}
