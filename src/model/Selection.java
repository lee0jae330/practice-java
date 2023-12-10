package model;

import validator.SelectionValidator;

public class Selection {
    private int selectedMenuNumber;

    public Selection(int selectedMenuNumber) {
        SelectionValidator.selectionValidator(selectedMenuNumber);
        this.selectedMenuNumber = selectedMenuNumber;
    }

    public int getSelectedMenuNumber() {
        return selectedMenuNumber;
    }
}
