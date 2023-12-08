package controller;

import java.sql.PseudoColumnUsage;
import java.util.regex.Pattern;
import validator.SelectionValidator;
import view.InputView;
import view.OutputView;

public class Controller {

    private static Controller singleton;

    private Controller(){
    }

    public static Controller getInstance() {
        singleton = new Controller();
        return singleton;
    }

    public void run() {
        printMenu();

    }

    private void printMenu() {
        OutputView.printHyphen(20);
        OutputView.printMenu();
        OutputView.printHyphen(20);
    }

    private int initSelection() {
        return InputView.printSelection();

    }

    private void bankProcess(int selection) {
        try {
            SelectionValidator.selectionValidator(selection);
            if(selection == 5) {
                OutputView.printExit();
                return;
            }

        } catch (IllegalArgumentException e) {
            bankProcess(initSelection());
        }

    }

}
