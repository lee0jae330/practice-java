package view;

import java.util.Scanner;
import util.InputViewMessage;
import validator.InputValidator;

public class InputView {

    private static final Scanner sc = new Scanner(System.in);

    public static int enterSelection() {
        System.out.print(InputViewMessage.SELECTION.getMessage());
        return InputValidator.checkNumberInputValidation(sc.nextLine());
    }

    public static String enterAccountNumber() {
        System.out.print(InputViewMessage.ACCOUNT_NUMBER.getMessage());
        return InputValidator.checkStringInputValidation(sc.nextLine());
    }

    public static String enterAccountOwner() {
        System.out.print(InputViewMessage.ACCOUNT_OWNER.getMessage());
        return InputValidator.checkStringInputValidation(sc.nextLine());
    }

    public static int enterAmount(String message) {
        System.out.print(message);
        return InputValidator.checkNumberInputValidation(sc.nextLine());
    }
}
