package controller;

import exception.InvalidAccountException;
import exception.InvalidInputException;
import exception.InvalidSelectionException;
import model.Account;
import model.BankApplication;
import model.Selection;

import util.InputViewMessage;
import view.InputView;
import view.OutputView;

public class Controller {

    private BankApplication bankApplication = new BankApplication();

    private static Controller singleton = null ;

    private Controller(){
    }

    public static Controller getInstance() {
        if(singleton == null) {
            singleton = new Controller();
        }
        return singleton;
    }

    public void run() {
        selectMenu(initSelection());
    }

    private void printMenu() {
        OutputView.printMenu();
    }

    private int initSelection() {
        printMenu();
        try{
            return InputView.enterSelection();
        } catch (InvalidInputException e) {
            OutputView.printError(e.getMessage());
            return initSelection();
        }

    }

    private void selectMenu(int number) {
        try {
            Selection selection = new Selection(number);
            bankProcess(selection.getSelectedMenuNumber());
        } catch (InvalidSelectionException e) {
            OutputView.printError(e.getMessage());
            selectMenu(initSelection());
        }
    }

    private void bankProcess(int selection) {
        if(selection == 1) {
            createAccount();
        } else if(selection ==2 ){
            showAllAccount();
        } else if(selection ==3 ) {

        } else if(selection == 4) {

        } else if(selection == 5) {
            OutputView.printExit();
            return;
        }
        selectMenu(initSelection());
    }

    private void printCreateMsg() {
        OutputView.printCreateMsg();
    }

    private void createAccount() {
        printCreateMsg();
        String accountNumber = InputView.enterAccountNumber();
        String accountOwner = InputView.enterAccountOwner();
        int initAmount = InputView.enterAmount(InputViewMessage.INIT_DEPOSIT_AMOUNT.getMessage());
        try{
            bankApplication.addAccount(new Account(accountNumber,accountOwner,initAmount));
            OutputView.printCreateResult();
        } catch (InvalidAccountException e) {
            OutputView.printError(e.getMessage());
            createAccount();
        }
    }

    private void showAllAccount() {
        OutputView.printAccounts(bankApplication.getAllAccountInformation());
    }
}
