package view;

import java.util.Scanner;
import util.InputViewMessage;
import validator.InputValidator;

public class InputView {

    public static int printSelection() {
        System.out.print(InputViewMessage.SELECTION.getMessage());
        Scanner sc = new Scanner(System.in);
        return InputValidator.checkValidation(sc.nextLine());
    }

}
