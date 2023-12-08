package validator;

import util.ConstantOfSelection;

public class SelectionValidator {

    private static final int minimumOfSelection = ConstantOfSelection.MINIMUM_SELECTION_NUMBER.getNumber();
    private static final int maximumOfSelection = ConstantOfSelection.MAXIMUM_SELECTION_NUMBER.getNumber();

    public static void selectionValidator(int selection) {
        if(selection < minimumOfSelection || selection > maximumOfSelection) {
            throw new IllegalArgumentException();
        }
    }
}
